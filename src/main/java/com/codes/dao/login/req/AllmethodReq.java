package com.codes.dao.login.req;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * login通用请求参数
 * @author
 * @date 2020/02/26 16:54
 */
@Entity
@Table(name="allmethod")
public class AllmethodReq {
    @Id
    private String method;
    @Column(name = "addr")
    private String addr;
    @Column(name = "memo")
    private String memo;
    @Column(name = "changea")
    private String changea;
    @Column(name = "changeb")
    private String changeb;
    @Column(name = "changec")
    private String changec;
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getChangea() {
        return changea;
    }

    public void setChangea(String changea) {
        this.changea = changea;
    }

    public String getChangeb() {
        return changeb;
    }

    public void setChangeb(String changeb) {
        this.changeb = changeb;
    }

    public String getChangec() {
        return changec;
    }

    public void setChangec(String changec) {
        this.changec = changec;
    }
}
