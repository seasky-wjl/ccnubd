package com.ccnu.pojo.dto;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 16:15
 */
public class PersonalProgressDto {

    private  int id;
    private String table_name;
    private String table_confirm;
    private String table_confirm_time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getTable_confirm() {
        return table_confirm;
    }

    public void setTable_confirm(String table_confirm) {
        this.table_confirm = table_confirm;
    }

    public String getTable_confirm_time() {
        return table_confirm_time;
    }

    public void setTable_confirm_time(String table_confirm_time) {
        this.table_confirm_time = table_confirm_time;
    }
}
