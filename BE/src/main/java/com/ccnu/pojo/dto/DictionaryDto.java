package com.ccnu.pojo.dto;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/29 12:57
 */
public class DictionaryDto {

    //字典类型(一级)
    private String typename;
    //字典类型（二级）
    private String datatype;
    //
    private int id_type;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }
}
