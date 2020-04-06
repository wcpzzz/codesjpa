package com.codes.dao.login;

import com.codes.dao.login.model.Allgp;
import com.codes.dao.login.model.JunzhiList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 实体类
 * @author
 * @date 2020/02/26 16:54
 */
@Repository
public interface JunzhiRepository extends JpaRepository<JunzhiList, String> {
}
