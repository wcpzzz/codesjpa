package com.codes.service.login.impl;

import com.codes.dao.login.AllgpRepository;
import com.codes.dao.login.model.Allgp;
import com.codes.service.login.AllgpService;
import org.assertj.core.util.Lists;
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
public class AllgpServiceImpl implements AllgpService {

    @Autowired
    private AllgpRepository allgpRepository;

    @Override
    public Allgp findByGpidAndGpname(String gpid, String gpname) {
            Optional<Allgp> modelOptional = Optional.ofNullable(allgpRepository.findByGpidAndGpname(gpid, gpname));
            if (!modelOptional.isPresent())
                return null;
            return modelOptional.get();
    }
    @Override
    public List<Allgp> findAll() {
        return allgpRepository.findAll();
    }
}
