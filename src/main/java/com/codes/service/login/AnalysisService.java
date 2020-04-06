package com.codes.service.login;

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
public interface AnalysisService {
//    展示所有股票
    List<Analysis> findAll(String account,String method);
    Analysis findByGpidAndMethod(String gpid,String method);
    String create(AnalysisReq req);
    void deleteById(int id);
}
