/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.repository
 * @className com.wangjing.jpa.jpatest.repository.UserRepository
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.repository;

import com.wangjing.jpa.jpatest.entity2.User2;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 *
 * @description userDao
 * @author wangjing
 * @date 2019/6/6 16:36
 * @version v1.0.0
 */
public interface UserRepository2 extends JpaRepository<User2, String> {

}
