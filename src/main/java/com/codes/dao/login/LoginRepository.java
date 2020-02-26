package com.codes.dao.login;

import com.codes.dao.login.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 实体类
 * @author
 * @date 2020/02/26 16:54
 */
@Repository
public interface LoginRepository extends CrudRepository<Login, String> {

}
