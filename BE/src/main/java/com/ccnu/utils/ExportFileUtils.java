package com.ccnu.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * @program: ccnu-bd
 * @description: 导出文件工具类
 * @author: lsc
 * @create: 2021-11-02 14:44
 **/
public class ExportFileUtils {

    /**
     * 导出excel
     * @param workbook
     * @param fieldNames  列名
     * @param title 文件名及sheet名
     * @param data
     */
    public static void excelExport(Workbook workbook, Map<String, String> fieldNames, String title, List<Map<String, Object>> data) {
        Sheet sheet = workbook.createSheet(title);
        CellStyle style1 = workbook.createCellStyle();
        //加粗放大的字体
        Font font = workbook.createFont();
        font.setFontHeightInPoints((short)20);
        font.setBold(true);
        //普通字体
        Font font1 = workbook.createFont();
        //普通加粗字体
        Font font2 = workbook.createFont();
        font2.setBold(true);

        //表头居中格式
        CellStyle centerStyle = workbook.createCellStyle();
        //水平垂直居中
        centerStyle.setAlignment(HorizontalAlignment.CENTER);
        centerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        centerStyle.setFont(font);

        //表头字段
        List<String> headerColumnName = new ArrayList<>();
        for(Map.Entry<String,String> entry : fieldNames.entrySet()){
            headerColumnName.add(entry.getKey());
        }

        CellStyle style = workbook.createCellStyle();
        //设置第一行格式
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font2);

        int rowIndex = 0;
        Row topRow = sheet.createRow(rowIndex);
        int i = 0;

        //创建表头
        topRow.setHeight((short)1600);
        Cell topCell = topRow.createCell(0);
        topCell.setCellValue(title);
        topCell.setCellStyle(centerStyle);
        CellRangeAddress region = new CellRangeAddress(0, 0, 0, fieldNames.size()-1);
        sheet.addMergedRegion(region);

        rowIndex = 1;
        Row secondRow = sheet.createRow(rowIndex);

        //设置列名
        for (String field : headerColumnName) {
            sheet.setColumnWidth(i,(fieldNames.get(field).length()+8)*256);
            Cell cell = secondRow.createCell(i++);
            cell.setCellValue(fieldNames.get(field));
            cell.setCellStyle(style);
        }

        //映射数据
        for (int i1 = 0; i1 < data.size(); i1++) {
            Map<String, Object> dataMap = data.get(i1);
            Row rows = sheet.createRow(rowIndex + i1 + 1);
            for (int i2 = 0; i2 < headerColumnName.size(); i2++) {
                String field = headerColumnName.get(i2);
                rows.createCell(i2).setCellStyle(CellStyleUtils.getCellStyle(style1, font1));
                if (dataMap.get(field) == null) {
                    rows.getCell(i2).setCellValue("");
                } else {
                    rows.getCell(i2).setCellValue(dataMap.get(field).toString());
                }
            }
        }
    }

}
