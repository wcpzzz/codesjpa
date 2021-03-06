package com.codes.service.login;

import com.codes.dao.login.model.Login;
import com.codes.dao.login.req.LoginReq;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * login业务接口定义
 * @author
 * @date 2020/02/26 16:54
 */
@Service
public interface LoginService {

    Login findByAccountAndPassword(String account, String password);
//    展示K线
    void showK(String kaddr, String knum);
    void showAnalysis(String id,String method, String account,String gpid,String gpname,String memo,String createOrUpdate,String minConf,String minSupport);
    void showAnalysis2(String id,String method, String account,String gpid,String gpname,String memo,String createOrUpdate);

//    List<GupiaoReq> findByMethod(String method);

    /**
     * 根据ID查询
     * @author
     * @date 2020/02/26 16:54
     */
    Login findById(String id);

    /**
     * 根据ID集查询
     * @author
     * @date 2020/02/26 16:54
     */
    List<Login> findByIds(List<String> ids);

    /**
     * 创建
     * @author
     * @date 2020/02/26 16:54
     */
    String create(LoginReq req);

    /**
     * 根据ID删除
     * @author
     * @date 2020/02/26 16:54
     */
    void deleteById(String id);

    /**
     * 根据ID集删除
     * @author
     * @date 2020/02/26 16:54
     */
    void deleteByIds(List<String> ids);

    /**
     * 根据ID更新
     * @author
     * @date 2020/02/26 16:54
     */
    void updateById(LoginReq req);

}
