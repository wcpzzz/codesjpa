package com.codes.dao.login.req;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * login通用请求参数
 * @author
 * @date 2020/02/26 16:54
 */
public class LoginReq {
    private String account;

    private String password;

    private String newpassword;

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
