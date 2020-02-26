package com.codes.login;

import com.codes.BaseTest;
import com.codes.service.login.LoginService;
import com.codes.dao.login.req.LoginReq;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * 测试用例
 * @author
 * @date 2020/02/26 16:54
 */
public class LoginServiceTest extends BaseTest {

    @Autowired
    private LoginService loginService;

    /**
     * 根据ID查询
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void findByIdTest() {
        print("根据ID查询测试通过");
    }

    /**
     * 根据ID集合查询
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void findByIdsTest() {
        print("根据ID集合查询测试通过");
    }
    /**
     * 根据ID删除
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void deleteByIdTest() {
        print("根据ID删除测试通过");
    }

    /**
     * 根据ID集删除
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void deleteByIdsTest() {
//        loginService.deleteByIds(Arrays.asList(1, 2));
//        print("根据ID集删除测试通过");
    }

    /**
     * 根据ID修改
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void updateById() {
        print("根据ID修改测试通过");
    }
}
