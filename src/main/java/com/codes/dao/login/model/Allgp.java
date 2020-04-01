package com.codes.dao.login.model;


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
@Table(name="allgp")
public class Allgp {

    public String getGpid() {
        return gpid;
    }

    public void setGpid(String gpid) {
        this.gpid = gpid;
    }

    public String getGpname() {
        return gpname;
    }

    public void setGpname(String gpname) {
        this.gpname = gpname;
    }
    @Id
    private String gpid;
    @Column(name = "gpname")
    private String gpname;

}
