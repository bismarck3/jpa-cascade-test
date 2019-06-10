/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.repository
 * @className com.wangjing.jpa.jpatest.repository.UserRepository
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.repository;

import com.wangjing.jpa.jpatest.entity.User;
import com.wangjing.jpa.jpatest.entity.UserAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * UserRepository
 *
 * @description userDao
 * @author wangjing
 * @date 2019/6/6 16:36
 * @version v1.0.0
 */
public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT new com.wangjing.jpa.jpatest.entity.UserAddress(u, a) FROM User u, Address a WHERE u.addressId = a.id")
    Page<UserAddress> findAllUserAddress(Pageable pageable);

}
