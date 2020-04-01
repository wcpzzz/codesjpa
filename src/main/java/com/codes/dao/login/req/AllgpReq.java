package com.codes.dao.login.req;


/**
 * login通用请求参数
 * @author
 * @date 2020/02/26 16:54
 */
public class AllgpReq {

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

    private String gpid;

    private String gpname;

}
