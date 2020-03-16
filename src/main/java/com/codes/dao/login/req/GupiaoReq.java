package com.codes.dao.login.req;

import javax.persistence.*;

/**
 * GupiaoReq通用请求参数
 *
 * @author
 * @date 2020/02/26 16:54
 */
@Entity
@Table(name = "analysis")
public class GupiaoReq {
    private String method;
    private String account;
    private String gpname;
    private String memo;
    private String imgaddr;
    private String analysis;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public String getId() {
        return imgaddr;
    }

    public void setId(String imgaddr) {
        this.imgaddr = imgaddr;
    }

    @Column(name = "method")
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    @Column(name = "account")
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    @Column(name = "gpname")
    public String getGpname() {
        return gpname;
    }
    public void setGpname(String gpname) {
        this.gpname = gpname;
    }

    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    @Column(name = "analysis")
    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }
}
