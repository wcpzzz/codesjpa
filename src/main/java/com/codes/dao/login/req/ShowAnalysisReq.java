package com.codes.dao.login.req;

/**
 * ShowKReq通用请求参数
 * @author
 * @date 2020/02/26 16:54
 */

public class ShowAnalysisReq {
    private String id;
    private String method;
    private String account;
    private String gpname;
    private String gpid;
    private String minConf;
    private String minSupport;
    private String createOrUpdate;
    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public String getGpid() {
        return gpid;
    }

    public void setGpid(String gpid) {
        this.gpid = gpid;
    }

    public String getMinConf() {
        return minConf;
    }

    public void setMinConf(String minConf) {
        this.minConf = minConf;
    }

    public String getMinSupport() {
        return minSupport;
    }

    public void setMinSupport(String minSupport) {
        this.minSupport = minSupport;
    }

    public String getCreateOrUpdate() {
        return createOrUpdate;
    }

    public void setCreateOrUpdate(String createOrUpdate) {
        this.createOrUpdate = createOrUpdate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
