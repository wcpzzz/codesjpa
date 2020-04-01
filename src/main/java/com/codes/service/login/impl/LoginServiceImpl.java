package com.codes.service.login.impl;

import com.codes.dao.login.LoginRepository;
import com.codes.dao.login.model.Login;
import com.codes.dao.login.req.LoginReq;
import com.codes.service.login.LoginService;
import net.sf.json.JSONObject;
import org.assertj.core.util.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    public Login findByAccountAndPassword(String account,String password) {
        Optional<Login> modelOptional = Optional.ofNullable(loginRepository.findByAccountAndPassword(account, password));
        if (!modelOptional.isPresent())
            return null;
        return modelOptional.get();
    }


    @Async
    @Override
    public void showK(String kaddr,String knum) {
        String[] arguments = new String[] {"python","C:\\Users\\Administrator\\PycharmProjects\\gupiao2\\truemethods\\gupiaoK.py",kaddr,knum+".csv"};
//        String[] arguments = new String[] {"python", "C:\\Users\\Administrator\\PycharmProjects\\gupiao2\\helloworld.py","2"};
        System.out.println(kaddr+knum);
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public List<GupiaoReq> findByMethod(String method) {
//        return Lists.newArrayList(loginRepository.findAllByMethod(method));
//    }


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
        Optional<Login> modelOptional2 = Optional.ofNullable(loginRepository.findByAccountAndPassword(req.getAccount(), req.getPassword()));
        if (!modelOptional2.isPresent()){
            throw new IllegalArgumentException("输入信息有误");
        }
        if (req.getAccount() == null)
            throw new IllegalArgumentException("缺少ID");
        Optional<Login> modelOptional = loginRepository.findById(req.getAccount());
        if (!modelOptional.isPresent())
            return;
        Login model = modelOptional.get();
//        BeanUtils.copyProperties(req, model);
        model.setAccount(req.getAccount());
        model.setPassword(req.getNewpassword());
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
