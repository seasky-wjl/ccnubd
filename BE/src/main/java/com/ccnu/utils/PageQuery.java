package com.ccnu.utils;

/**
 * @program: ccnu_-bd
 * @description: 分页查询
 * @author: lsc
 * @create: 2020-11-30 18:33
 **/
public class PageQuery {

    // 页码（从1开始）
    protected int pageNo = 1;

    // 每页数量
    protected int pageSize = 10;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
