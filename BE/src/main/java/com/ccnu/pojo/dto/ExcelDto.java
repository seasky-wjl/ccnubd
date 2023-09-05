package com.ccnu.pojo.dto;

import javax.xml.xpath.XPath;

/**
 * @author 王新强
 * @version 1.0
 * @date 2021/1/4 13:32
 */
public class ExcelDto {

    private String excelPath;
    private int excelstatus;

    public int getExcelstatus() {
        return excelstatus;
    }

    public void setExcelstatus(int excelstatus) {
        this.excelstatus = excelstatus;
    }

    public String getExcelPath() {
        return excelPath;
    }

    public void setExcelPath(String excelPath) {
        this.excelPath = excelPath;
    }
}
