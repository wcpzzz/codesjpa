package com.codes.service.login;

import com.codes.dao.login.model.Allmethod;
import com.codes.dao.login.model.Analysis;
import com.codes.dao.login.req.AnalysisReq;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * login业务接口定义
 * @author
 * @date 2020/02/26 16:54
 */
@Service
public interface AllmethodService {
//    展示所有股票
    List<Allmethod> findAll();
    Allmethod findByMethod(String method);
}
