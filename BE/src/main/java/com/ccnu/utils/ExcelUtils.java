package com.ccnu.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;

/**
 * @Auther: bruceliu
 * @Date: 2019/12/12 15:23
 * @QQ:1241488705
 * @Description: Excel文件操作工具类
 */
public class ExcelUtils {

    /**
     * 导出Excel
     *
     * @param sheetName sheet名称
     * @param title     标题
     * @param values    内容
     * @return
     */
    public static HSSFWorkbook getHSSFWorkbook(String sheetName, String[] title, String[][] values) {

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();

        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(sheetName);

        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);

        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
     //   style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

        //声明列对象
        HSSFCell cell = null;

        //创建标题
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style); //设置样式
        }

        //创建内容
        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i + 1);
            for (int j = 0; j < values[i].length; j++) {
                //将内容按顺序赋给对应的列对象
                HSSFCell cell1 = row.createCell(j);
                cell1.setCellValue(values[i][j]);
                cell1.setCellStyle(style); //设置样式
            }
        }
        return wb;
    }

    /**
     * 利用正则表达式判断字符串是否是数字
     */
    public static boolean isNumeric(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        }
        String reg = "^\\d+(\\.\\d+)?$";
        return str.matches(reg);
    }

    public static boolean isInteger(String input) {
        Matcher mer = Pattern.compile("^[+-]?[0-9]+$").matcher(input);
        return mer.find();
    }

}
