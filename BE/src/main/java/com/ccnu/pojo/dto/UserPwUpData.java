package com.ccnu.pojo.dto;

/**
 * @author 王新强
 * @version 1.0
 * @date 2021/1/12 22:19
 */
public class UserPwUpData {

    int id;
    String username;
    String olderPw;
    String newPw;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOlderPw() {
        return olderPw;
    }

    public void setOlderPw(String olderPw) {
        this.olderPw = olderPw;
    }

    public String getNewPw() {
        return newPw;
    }

    public void setNewPw(String newPw) {
        this.newPw = newPw;
    }
}
