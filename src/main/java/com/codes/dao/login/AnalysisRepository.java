package com.codes.dao.login;

import com.codes.dao.login.model.Allgp;
import com.codes.dao.login.model.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 实体类
 * @author
 * @date 2020/02/26 16:54
 */
@Repository
public interface AnalysisRepository extends JpaRepository<Analysis, Integer> {
    Analysis findByGpidAndMethod(String gpid, String method);
    Analysis findByGpid(String gpid);
    List<Analysis> findAllByAccountAndMethod(String account,String method);
}
