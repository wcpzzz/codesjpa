package com.codes.dao.login.model;

import javax.persistence.*;

/**
 * @author
 * @date 2020-02-26 16:54:45
 * @email
 */
@Entity
@Table(name="login")
public class Login {
    @Id
    @Column(name = "ACCOUNT")
    private String account;

    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
