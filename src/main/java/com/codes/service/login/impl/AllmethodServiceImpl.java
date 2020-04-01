package com.codes.service.login.impl;

import com.codes.dao.login.AllmethodRepository;
import com.codes.dao.login.AnalysisRepository;
import com.codes.dao.login.model.Allgp;
import com.codes.dao.login.model.Allmethod;
import com.codes.dao.login.model.Analysis;
import com.codes.dao.login.req.AnalysisReq;
import com.codes.service.login.AllmethodService;
import com.codes.service.login.AnalysisService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * 接口实现类
 * @author
 * @date 2020/02/26 16:54
 */
@Service
public class AllmethodServiceImpl implements AllmethodService {

    @Autowired
    private AllmethodRepository allmethodRepository;
    @Override
    public List<Allmethod> findAll() {
        return allmethodRepository.findAll();
    }
    @Override
    public Allmethod findByMethod(String method) {
        Optional<Allmethod> modelOptional = Optional.ofNullable(allmethodRepository.findByMethod(method));
        if (!modelOptional.isPresent())
            return null;
        return modelOptional.get();
    }

}
