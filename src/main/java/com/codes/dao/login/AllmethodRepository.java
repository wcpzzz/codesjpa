package com.codes.dao.login;

import com.codes.dao.login.model.Allmethod;
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
public interface AllmethodRepository extends JpaRepository<Allmethod, String> {
    List<Allmethod> findAll();
    Allmethod findByMethod(String method);
}
