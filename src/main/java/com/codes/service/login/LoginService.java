package com.codes.service.login;

import com.codes.dao.login.model.Login;
import com.codes.dao.login.req.LoginReq;

import java.util.List;

/**
 * login业务接口定义
 * @author
 * @date 2020/02/26 16:54
 */
public interface LoginService {

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
