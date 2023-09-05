package com.ccnu.utils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * @program: ccnu-bd
 * @description: 数据库工具类
 * @author: lsc
 * @create: 2021-11-02 21:35
 **/
public class DBUtils {

    /**
     * 获取结果集封装为map结构
     *
     * @param jdbcTemplate
     * @param sql
     * @param fields
     * @return
     */
    public static List<Map<String, Object>> findListByTableSql(JdbcTemplate jdbcTemplate, String
            sql, List<String> fields) {
        return jdbcTemplate.query(sql, (RowMapper) (rs, i) -> {
            Map<String, Object> result = new LinkedHashMap<>();
            for (String field : fields) {
                String temp = null;
                try {
                    temp = rs.getString(field);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (ExcelUtils.isNumeric(temp)) {
                    try {
                        if (ExcelUtils.isInteger(temp)) {
                            result.put(field, Long.parseLong(temp));
                        } else {
                            result.put(field, Double.parseDouble(temp));
                        }
                    } catch (NumberFormatException e) {
                        result.put(field, temp);
                    }
                } else {
                    result.put(field, temp);
                }
            }
            return result;
        });
    }

    /**
     * 获取数据库列名
     * @param column
     */
    public static List<String> getColumns(Map<String,String> column){
        List<String> columns = new ArrayList<>();
        for(Map.Entry<String,String> map : column.entrySet()){
            columns.add(map.getKey());
        }
        return columns;
    }

}
