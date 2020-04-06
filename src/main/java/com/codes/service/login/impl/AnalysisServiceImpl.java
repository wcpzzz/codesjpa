package com.codes.service.login.impl;
import com.codes.dao.login.AnalysisRepository;
import com.codes.dao.login.model.Analysis;
import com.codes.dao.login.req.AnalysisReq;
import com.codes.service.login.AnalysisService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Optional;


/**
 * 接口实现类
 * @author
 * @date 2020/02/26 16:54
 */
@Service
public class AnalysisServiceImpl implements AnalysisService {

    @Autowired
    private AnalysisRepository analysisRepository;

    @Override
    public Analysis findByGpidAndMethod(String gpid, String method) {
        Optional<Analysis> modelOptional = Optional.ofNullable(analysisRepository.findByGpidAndMethod(gpid,method));
        if (!modelOptional.isPresent())
            return null;
        return modelOptional.get();
    }
    @Override
    public List<Analysis> findAll(String account,String method) {
        return analysisRepository.findAllByAccountAndMethod(account,method);
    }
    @Override
    public void deleteById(int id) {
        analysisRepository.deleteById(id);
    }
    @Override
    public String create(AnalysisReq req) {
        if(analysisRepository.findByGpidAndMethod(req.getGpid(), req.getMethod())!=null){
            return null;
        }
        Analysis model = new Analysis();
        BeanUtils.copyProperties(req, model);
        model = analysisRepository.save(model);
        return model.getAccount();
    }
}
