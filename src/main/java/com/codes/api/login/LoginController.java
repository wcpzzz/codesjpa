package com.codes.api.login;

import com.codes.api.BaseController;
import com.codes.core.model.R;
import com.codes.dao.login.model.Login;
import com.codes.dao.login.req.LoginReq;
import com.codes.service.login.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author
 * @date 2020/02/26 16:54
 */
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    /**
     * 根据ID查询
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/{id}")
    public R<Login> findById(@PathVariable String id) {
        return R.data(loginService.findById(id));
    }

    /**
     * 根据ID集查询
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/batch/{ids}")
    public R<List<Login>> findByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<String> idList = new ArrayList<>();
            for (String id: idArray) {
                idList.add(id.trim());
            }
            return R.data(loginService.findByIds(idList));
        }
        return R.success();
    }
    /**
     * 创建
     * @author
     * @date 2020/02/26 16:54
     */
    @PostMapping("/create")
    public R create(LoginReq req) {
        return R.data(loginService.create(req));
    }

    /**
     * 根据ID删除
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/delete/{id}")
    public R deleteById(@PathVariable String id) {
        loginService.deleteById(id);
        return R.success();
    }

    /**
     * 根据ID集删除
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/delete/batch/{ids}")
    public R deleteByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<String> idList = new ArrayList<>();
            for (String id: idArray) {
              idList.add(id.trim());
            }
            loginService.deleteByIds(idList);
        }
        return R.success();
    }
    /**
     * 根据ID更新
     * @author
     * @date 2020/02/26 16:54
     */
    @PostMapping("/update")
    public R updateById(LoginReq req) {
        loginService.updateById(req);
        return R.success();
    }

}
