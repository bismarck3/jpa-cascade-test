/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.repository
 * @className com.wangjing.jpa.jpatest.repository.UserRepository
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.repository;

import com.wangjing.jpa.jpatest.entity.User;
import com.wangjing.jpa.jpatest.entity.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * UserRepository
 *
 * @description userDao
 * @author wangjing
 * @date 2019/6/6 16:36
 * @version v1.0.0
 */
public interface UserVORepository extends JpaRepository<User, String> {

    @Query("SELECT new com.wangjing.jpa.jpatest.entity.UserVO(u.id, u.name, u.age, a.name) FROM User u, Address a")
    List<UserVO> findAllUserAddress();

}
