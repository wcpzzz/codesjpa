package com.codes.service.login.impl;

import com.codes.dao.login.LoginRepository;
import com.codes.dao.login.model.Login;
import com.codes.dao.login.req.LoginReq;
import com.codes.service.login.LoginService;
import org.assertj.core.util.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;


/**
 * 接口实现类
 * @author
 * @date 2020/02/26 16:54
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Login findById(String id) {
        Optional<Login> modelOptional = loginRepository.findById(id);
        if (!modelOptional.isPresent())
            return null;
        return modelOptional.get();
    }

    @Override
    public List<Login> findByIds(List<String> ids) {
        return Lists.newArrayList(loginRepository.findAllById(ids));
    }

    @Override
    public String create(LoginReq req) {
        Login model = new Login();
        BeanUtils.copyProperties(req, model);
        model = loginRepository.save(model);
        return model.getAccount();
    }

    @Override
    public void updateById(LoginReq req) {
        if (req.getAccount() == null)
            throw new IllegalArgumentException("缺少ID");
        Optional<Login> modelOptional = loginRepository.findById(req.getAccount());
        if (!modelOptional.isPresent())
            return;
        Login model = modelOptional.get();
        BeanUtils.copyProperties(req, model);
        loginRepository.save(model);
    }

    @Override
    public void deleteById(String id) {
        loginRepository.deleteById(id);
    }

    @Override
    public void deleteByIds(List<String> ids) {
        if (CollectionUtils.isEmpty(ids))
            return;
        for (String id: ids)
            loginRepository.deleteById(id);
    }
}
