package com.codes.dao.login.req;


/**
 * login通用请求参数
 * @author
 * @date 2020/02/26 16:54
 */
public class LoginReq {

    private String account;

    private String password;

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
