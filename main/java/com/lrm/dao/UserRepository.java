package com.lrm.dao;

import com.lrm.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by limi on 2017/10/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select b from User b where b.password=?2 and b.username=?1")
    User findByUsernameAndPassword(String username, String password);
}
