package com.ccnu.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ccnu.mapper.ConfirmInformationMapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.mapper.UserStatusMapper;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.ConfirmInformationExample;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.UserAccountExample.Criteria;
import com.ccnu.pojo.UserStatus;
import com.ccnu.pojo.UserStatusExample;
import com.ccnu.service.ExportDataService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.DBUtils;
import com.ccnu.utils.DataSheetInfoEnum;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.ExportFileUtils;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @program: ccnu-bd
 * @description: 导出数据实现类
 * @author: lsc
 * @create: 2021-11-02 16:33
 **/
@Service
public class ExportDataServiceImpl implements ExportDataService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserStatusMapper userStatusMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private ConfirmInformationMapper confirmInformationMapper;

    /**
     * 导出个人的数据到excel
     */
    @Override
    public void exportPersonalData(String tutorId, HttpServletResponse response) {
        Workbook workbook = new HSSFWorkbook();
//        exportForm1(workbook, tutorId, null);
//        exportForm2(workbook, tutorId, null);
//        exportForm3(workbook, tutorId, null);
        exportForm1Merge(workbook, tutorId, null);
        exportForm4(workbook, tutorId, null);
        exportForm5(workbook, tutorId, null);
        exportForm6(workbook, tutorId, null);
        exportForm7(workbook, tutorId, null);
        exportForm8(workbook, tutorId, null);
        exportForm9(workbook, tutorId, null);
        exportForm10(workbook, tutorId, null);
        exportForm11(workbook, tutorId, null);
        exportForm12(workbook, tutorId, null);
        exportForm13(workbook, tutorId, null);
        exportForm14(workbook, tutorId, null);
        exportForm15(workbook, tutorId, null);
        exportForm16(workbook, tutorId, null);
        exportForm17(workbook, tutorId, null);
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-Disposition",
                    "attachment; filename=" + URLEncoder.encode(tutorId, "utf-8") + ".xls");
            response.flushBuffer();
            workbook.write(out);
        } catch (Exception e) {
            throw new AppException(ErrorCode.ERR_BIZ);
        } finally {
            try {
                workbook.close();
            } catch (IOException e1) {
                throw new AppException(ErrorCode.ERR_BIZ);
            }
        }
    }

    /**
     * 导出所有博导信息
     */
    @Override
    public void exportCollectiveData(HttpServletResponse response) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        Workbook workbook = new HSSFWorkbook();
        exportForm1Merge(workbook,null,null);
//        exportForm1(workbook, null, null);
//        exportForm2(workbook, null, null);
//        exportForm3(workbook, null, null);
        exportForm4(workbook, null, null);
        exportForm5(workbook, null, null);
        exportForm6(workbook, null, null);
        exportForm7(workbook, null, null);
        exportForm8(workbook, null, null);
        exportForm9(workbook, null, null);
        exportForm10(workbook, null, null);
        exportForm11(workbook, null, null);
        exportForm12(workbook, null, null);
        exportForm13(workbook, null, null);
        exportForm14(workbook, null, null);
        exportForm15(workbook, null, null);
        exportForm16(workbook, null, null);
        exportForm17(workbook, null, null);
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-Disposition",
                    "attachment; filename=" + URLEncoder.encode(year + "博导信息", "utf-8") + ".xls");
            response.flushBuffer();
            workbook.write(out);
        } catch (Exception e) {
            throw new AppException(ErrorCode.ERR_BIZ);
        } finally {
            try {
                workbook.close();
            } catch (IOException e1) {
                throw new AppException(ErrorCode.ERR_BIZ);
            }
        }
    }

    /**
     * 导出院系博导信息
     */
    @Override
    public void exportFacultyData(String facultyCode, HttpServletResponse response) {
        Workbook workbook = new HSSFWorkbook();
//        exportForm1(workbook, null, facultyCode);
//        exportForm2(workbook, null, facultyCode);
//        exportForm3(workbook, null, facultyCode);
        exportForm1Merge(workbook, null, facultyCode);
        exportForm4(workbook, null, facultyCode);
        exportForm5(workbook, null, facultyCode);
        exportForm6(workbook, null, facultyCode);
        exportForm7(workbook, null, facultyCode);
        exportForm8(workbook, null, facultyCode);
        exportForm9(workbook, null, facultyCode);
        exportForm10(workbook, null, facultyCode);
        exportForm11(workbook, null, facultyCode);
        exportForm12(workbook, null, facultyCode);
        exportForm13(workbook, null, facultyCode);
        exportForm14(workbook, null, facultyCode);
        exportForm15(workbook, null, facultyCode);
        exportForm16(workbook, null, facultyCode);
        exportForm17(workbook, null, facultyCode);
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-Disposition",
                    "attachment; filename=" + URLEncoder.encode(facultyCode + "博导信息", "utf-8") + ".xls");
            response.flushBuffer();
            workbook.write(out);
        } catch (Exception e) {
            throw new AppException(ErrorCode.ERR_BIZ);
        } finally {
            try {
                workbook.close();
            } catch (IOException e1) {
                throw new AppException(ErrorCode.ERR_BIZ);
            }
        }
    }

    /**
     * 导出未完成采集的博导信息
     */
    @Override
    public void exportFailData(HttpServletResponse response) {
        Workbook workbook = new HSSFWorkbook();
        exportForm1000(workbook);
        try {
            ServletOutputStream out = response.getOutputStream();
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-Disposition",
                    "attachment; filename=" + URLEncoder.encode("未完成采集的博导信息", "utf-8") + ".xls");
            response.flushBuffer();
            workbook.write(out);
        } catch (Exception e) {
            throw new AppException(ErrorCode.ERR_BIZ);
        } finally {
            try {
                workbook.close();
            } catch (IOException e1) {
                throw new AppException(ErrorCode.ERR_BIZ);
            }
        }
    }

    /**
     * 导出未采集完成的博导信息
     */
    public void exportForm1000(Workbook workbook) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.INCOMPLETE.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        UserStatusExample userStatusExample = new UserStatusExample();
        userStatusExample.createCriteria().andWorkStatusEqualTo("1");
        List<UserStatus> userStatuses = userStatusMapper.selectByExample(userStatusExample);
        List<Integer> idList = new ArrayList<>();

        UserAccountExample userAccountExample = new UserAccountExample();
        Criteria criteria = userAccountExample.createCriteria().andRoleEqualTo(4);

        List<String> codes = new ArrayList<>();
        List<ConfirmInformation> confirmInformations = new ArrayList<>();

        if (userStatuses != null && userStatuses.size() > 0) {
            //有不在岗的博导
            idList = userStatuses.stream().map(item -> item.getUserId()).collect(Collectors.toList());
            criteria.andIdIn(idList);

            List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);

            if (userAccounts != null && userAccounts.size() > 0) {
                codes = userAccounts.stream().map(item -> item.getUsername()).collect(Collectors.toList());
            }
            ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
            ConfirmInformationExample.Criteria criteria1 = confirmInformationExample.createCriteria();
            if (codes != null && codes.size() > 0) {
                criteria1.andTutorIdentificationCodeNotIn(codes);
            }
            criteria1.andTotalConfirmEqualTo("0");
            confirmInformations = confirmInformationMapper
                    .selectByExample(confirmInformationExample);
        } else {
            //所有博导都在岗
            ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
            confirmInformationExample.createCriteria().andTotalConfirmEqualTo("0");
            confirmInformations = confirmInformationMapper
                    .selectByExample(confirmInformationExample);
        }

        String ids = "";
        if (confirmInformations != null && confirmInformations.size() > 0) {
            List<String> confirmCodes = confirmInformations.stream().map(item -> item.getTutorIdentificationCode())
                    .collect(
                            Collectors.toList());
            ids = confirmCodes.stream().map(String::valueOf).map(s -> "\'" + s + "\'").collect(Collectors.joining(","));
            String sql =
                    "select *,tutor_identification_code as tutor_id from doctor_tutor_information_1_1_1 where tutor_identification_code in ("
                            + ids + ");";
            //需要导出的数据
            List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
            ExportFileUtils.excelExport(workbook, column, "未采集完成的博导信息", data);
        }else {
            throw new AppException(ErrorCode.ERR_BIZ, "所有博导信息都已采集成功!");
        }
    }

    /**
     * 导出合并后的表1-1-1数据
     */
    public void exportForm1Merge(Workbook workbook,String tutorId, String facultyCode){
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FORM_1_1_1_merge.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "SELECT * ,CONCAT('4142010511',a.tutor_identification_code) as tutor_id\n" +
                        "from doctor_tutor_information_1_1_1 a\n" +
                        "LEFT JOIN doctor_tutor_information_1_1_1_xu1 b\n" +
                        "ON a.tutor_identification_code = b.tutor_identification_code\n" +
                        "LEFT JOIN doctor_tutor_information_1_1_1_xu2 c\n" +
                        "ON a.tutor_identification_code = c.tutor_identification_code\n" +
                        "where a.isdelete = '0' AND b.isdelete = '0' AND c.isdelete = '0'" +
                        " and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                //导出所有数据
                sql = "SELECT * ,CONCAT('4142010511',a.tutor_identification_code) as tutor_id\n" +
                        "from doctor_tutor_information_1_1_1 a\n" +
                        "LEFT JOIN doctor_tutor_information_1_1_1_xu1 b\n" +
                        "ON a.tutor_identification_code = b.tutor_identification_code\n" +
                        "LEFT JOIN doctor_tutor_information_1_1_1_xu2 c\n" +
                        "ON a.tutor_identification_code = c.tutor_identification_code\n" +
                        "where a.isdelete = '0' AND b.isdelete = '0' AND c.isdelete = '0';";
            }
        } else {
            sql = "SELECT * , a.tutor_identification_code as tutor_id\n" +
                    "from doctor_tutor_information_1_1_1 a\n" +
                    "LEFT JOIN doctor_tutor_information_1_1_1_xu1 b\n" +
                    "ON a.tutor_identification_code = b.tutor_identification_code\n" +
                    "LEFT JOIN doctor_tutor_information_1_1_1_xu2 c\n" +
                    "ON a.tutor_identification_code = c.tutor_identification_code\n" +
                    "where a.isdelete = '0' AND b.isdelete = '0' AND c.isdelete = '0' and a.tutor_identification_code = '"
                    + tutorId + "' LIMIT 1;";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表1-1-1 博士导师信息（时点）", data);
    }

    /**
     * 导出表1-1-1数据
     */
    public void exportForm1(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_1_1_1.getColumnName(), LinkedHashMap.class);

        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id from doctor_tutor_information_1_1_1 where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                //导出所有数据
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id from doctor_tutor_information_1_1_1 where isdelete = '0';";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from doctor_tutor_information_1_1_1 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "' LIMIT 1;";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表1-1-1 博士导师信息（时点）", data);
    }

    /**
     * 导出表1-1-1_xu1数据
     */
    public void exportForm2(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_1_1_1_xu1.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from doctor_tutor_information_1_1_1_xu1 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                //导出所有数据
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from doctor_tutor_information_1_1_1_xu1 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0';";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from doctor_tutor_information_1_1_1_xu1 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "' LIMIT 1;";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表1-1-1博士导师信息（续1）（时点)", data);
    }

    /**
     * 导出表1-1-1_xu2数据
     */
    public void exportForm3(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_1_1_1_xu2.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from doctor_tutor_information_1_1_1_xu2"
                        + " LEFT JOIN user_account as a on a.username = tutor_identification_code where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from doctor_tutor_information_1_1_1_xu2"
                        + " LEFT JOIN user_account as a on a.username = tutor_identification_code where isdelete = '0';";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from doctor_tutor_information_1_1_1_xu2 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "' LIMIT 1;";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表1-1-1 博士导师信息表（续2）（时点）", data);
    }

    /**
     * 导出表1-1-2数据
     */
    public void exportForm4(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_1_1_2.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                //输出院系博导信息
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,\n"
                        + "CONCAT('4142010511',doctoral_student_identification_code) as student_id,\n"
                        + "a.realname as tutor_name,"
                        + "IF((ISNULL(cooperative_guidance_tutor_identification_code) or LENGTH(trim(cooperative_guidance_tutor_identification_code)) < 1),'',CONCAT('4142010511',cooperative_guidance_tutor_identification_code)) as cooperative_tutor_id \n"
                        + "from doctor_student_information_1_1_2 \n"
                        + " LEFT JOIN user_account as a on a.username = tutor_identification_code "
                        + "where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                //输出所有博导信息
                sql = "select *,\n" +
                        "\ta.tutor_identification_code as tutor_id,\n" +
                        "\tb.realname as tutor_name, \n" +
                        "\ta.doctoral_student_identification_code as student_id,\n" +
                        "\tIF(\tISNULL(a.cooperative_guidance_tutor_identification_code) or LENGTH(trim(a.cooperative_guidance_tutor_identification_code)) < 1,\n" +
                        "\t\t\t\t'',\n" +
                        "\t\t\t\ta.cooperative_guidance_tutor_identification_code) as cooperative_tutor_id\n" +
                        "from doctor_student_information_1_1_2 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id,doctoral_student_identification_code as student_id,cooperative_guidance_tutor_identification_code"
                    + " as cooperative_tutor_id from doctor_student_information_1_1_2 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表1-1-2 博士生信息表（时期）", data);
    }

    /**
     * 导出表1-2-1数据
     */
    public void exportForm5(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_1_2_1.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from research_project_situation_1_2_1"
                        + " LEFT JOIN user_account as a on a.username = tutor_identification_code where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\ta.tutor_identification_code as tutor_id,\n" +
                        "\tb.realname as tutor_name \n" +
                        "from research_project_situation_1_2_1 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from research_project_situation_1_2_1 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表1-2-1 科研项目情况（时期）", data);
    }

    /**
     * 导出表2-1-1数据
     */
    public void exportForm6(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_1_1.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from course_status_2_1_1 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "    b.realname as tutor_name\n" +
                        "FROM course_status_2_1_1 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from course_status_2_1_1 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId
                    + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-1-1 开课情况（时期）", data);
    }

    /**
     * 导出表2-1-2数据
     */
    public void exportForm7(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_1_2.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from graduate_education_teaching_reform_research_project_2_1_2 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "    b.realname as tutor_name\n" +
                        "from graduate_education_teaching_reform_research_project_2_1_2  a \n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from graduate_education_teaching_reform_research_project_2_1_2 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-1-2 研究生教育教学改革研究项目情况（时期）", data);
    }

    /**
     * 导出表2-1-3数据
     */
    public void exportForm8(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_1_3.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from publishing_textbook_situation_2_1_3 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "    b.realname as tutor_name \n" +
                        "from publishing_textbook_situation_2_1_3 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from publishing_textbook_situation_2_1_3 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-1-3 出版教材情况（时期）", data);
    }

    /**
     * 导出表2-1-4数据
     */
    public void exportForm9(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_1_4.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from awards_for_graduate_teaching_achievements_2_1_4 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "    b.realname as tutor_name \n" +
                        "from awards_for_graduate_teaching_achievements_2_1_4 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from awards_for_graduate_teaching_achievements_2_1_4 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-1-4 研究生教学成果获奖情况（时期）", data);
    }

    /**
     * 导出表2-1-5数据
     */
    public void exportForm10(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_1_5.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,\n"
                        + "a.realname as tutor_name,"
                        + "IF((ISNULL(award_doctoral_student_identification_code) or LENGTH(trim(award_doctoral_student_identification_code)) < 1),\"\",CONCAT('4142010511',award_doctoral_student_identification_code))\n"
                        + "as award_student_id from guided_doctoral_students_awards_2_1_5 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "\t\tb.realname as tutor_name,\n" +
                        "    IF(( ISNULL(award_doctoral_student_identification_code) or LENGTH(trim(award_doctoral_student_identification_code))<1),\n" +
                        "\t\t\"\",CONCAT('4142010511',award_doctoral_student_identification_code)) as award_student_id \n" +
                        "from guided_doctoral_students_awards_2_1_5 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id,award_doctoral_student_identification_code as award_student_id from guided_doctoral_students_awards_2_1_5 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-1-5 指导博士生获奖情况（时期）", data);
    }

    /**
     * 导出表2-2-1数据
     */
    public void exportForm11(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_1.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from research_papers_2_2_1 LEFT JOIN user_account as a on a.username = tutor_identification_code "
                        + "where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "    b.realname as tutor_name \n" +
                        "from research_papers_2_2_1 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from research_papers_2_2_1 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId
                    + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-1 科研论文情况（时期）", data);
    }

    /**
     * 导出表2-2-2数据
     */
    public void exportForm12(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_2.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from research_awards_2_2_2 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "\t\tb.realname as tutor_name \n" +
                        "from research_awards_2_2_2 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from research_awards_2_2_2 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId
                    + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-2 科研获奖情况（时期）", data);
    }

    /**
     * 导出表2-2-3数据
     */
    public void exportForm13(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_3.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from publication_status_2_2_3 LEFT JOIN user_account as a on a.username = tutor_identification_code "
                        + "where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "\t\tb.realname as tutor_name \n" +
                        "from publication_status_2_2_3  a \n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from publication_status_2_2_3 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-3 出版著作情况（时期）", data);
    }

    /**
     * 导出表2-2-4数据
     */
    public void exportForm14(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_4.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from patent_or_copyright_authorization_status_2_2_4 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "\t\tb.realname as tutor_name \n" +
                        "from patent_or_copyright_authorization_status_2_2_4 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from patent_or_copyright_authorization_status_2_2_4 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-4  专利（著作权）授权情况（时期）", data);
    }

    /**
     * 导出表2-2-5数据
     */
    public void exportForm15(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_5.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from participation_international_academic_conferences_2_2_5 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where is_delete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\ta.tutor_identification_code as tutor_id,\n" +
                        "  b.realname as tutor_name \n" +
                        "from participation_international_academic_conferences_2_2_5 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.is_delete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from participation_international_academic_conferences_2_2_5 where is_delete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-5 参加国际学术会议情况（时期）", data);
    }

    /**
     * 导出表2-2-6数据
     */
    public void exportForm16(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_6.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from academic_appointment_2_2_6 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\ttutor_identification_code as tutor_id,\n" +
                        "  b.realname as tutor_name \n" +
                        "from academic_appointment_2_2_6 a\n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from academic_appointment_2_2_6 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-6 学术任职情况（时点）", data);
    }

    /**
     * 导出表2-2-7数据
     */
    public void exportForm17(Workbook workbook, String tutorId, String facultyCode) {
        Map<String, String> column = JSONObject
                .parseObject(DataSheetInfoEnum.FROM_2_2_7.getColumnName(), LinkedHashMap.class);
        //数据库列名
        List<String> columns = DBUtils.getColumns(column);
        String sql;
        if (StringUtils.isBlank(tutorId)) {
            if (StringUtils.isNotBlank(facultyCode)) {
                sql = "select *,CONCAT('4142010511',tutor_identification_code) as tutor_id,"
                        + "a.realname as tutor_name from relying_on_scientific_research_platform_2_2_7 LEFT JOIN user_account as a on a.username = tutor_identification_code"
                        + " where isdelete = '0' and tutor_identification_code"
                        + " in (select username from user_account where role = 4 and faculty_code = '" + facultyCode
                        + "');";
            } else {
                sql = "select *,\n" +
                        "\t\ta.tutor_identification_code as tutor_id,\n" +
                        "\t\tb.realname as tutor_name \n" +
                        "from relying_on_scientific_research_platform_2_2_7 a \n" +
                        "INNER JOIN tutor_status_temp b\n" +
                        "ON b.tutor_id = a.tutor_identification_code\n" +
                        "WHERE a.isdelete = '0'\n" +
                        "ORDER BY a.tutor_identification_code;";
            }
        } else {
            sql = "select *,tutor_identification_code as tutor_id from relying_on_scientific_research_platform_2_2_7 where isdelete = '0' and tutor_identification_code = '"
                    + tutorId + "';";
        }
        //需要导出的数据
        List<Map<String, Object>> data = DBUtils.findListByTableSql(jdbcTemplate, sql, columns);
        ExportFileUtils.excelExport(workbook, column, "表2-2-7 依托科研平台情况（时点）", data);
    }

}
