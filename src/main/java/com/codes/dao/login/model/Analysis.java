package com.codes.dao.login.model;


import javax.persistence.*;

/**
 * login通用请求参数
 * @author
 * @date 2020/02/26 16:54
 */
@Entity
@Table(name="analysis")
public class Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "method")
    private String method;
    @Column(name = "gpid")
    private String gpid;
    @Column(name = "account")
    private String account;
    @Column(name = "gpname")
    private String gpname;
    @Column(name = "memo")
    private String memo;
    @Column(name = "analysis")
    private String analysis;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getGpid() {
        return gpid;
    }

    public void setGpid(String gpid) {
        this.gpid = gpid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getGpname() {
        return gpname;
    }

    public void setGpname(String gpname) {
        this.gpname = gpname;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }
}
