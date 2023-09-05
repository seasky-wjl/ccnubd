package com.ccnu.pojo;

import java.io.Serializable;

public class DataDictionaryType implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String typecode;

    /**
     * 
     */
    private String typename;

    /**
     * data_dictionary_type
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return typecode 
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * 
     * @param typecode 
     */
    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    /**
     * 
     * @return typename 
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 
     * @param typename 
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typecode=").append(typecode);
        sb.append(", typename=").append(typename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}