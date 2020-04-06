package com.codes.service.login;

import com.codes.dao.login.model.Allgp;
import com.codes.dao.login.model.JunzhiList;
import com.codes.dao.login.req.AllgpReq;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * login业务接口定义
 * @author
 * @date 2020/02/26 16:54
 */
@Service
public interface AllgpService {
//    展示所有股票
    Allgp findByGpidAndGpname(String gpid, String gpname);
    List<Allgp> findAll();
    List<JunzhiList> findJunzhiAll();
}
