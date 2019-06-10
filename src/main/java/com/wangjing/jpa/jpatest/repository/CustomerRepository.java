/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.repository
 * @className com.wangjing.jpa.jpatest.repository.CustomerRepository
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.repository;

import com.wangjing.jpa.jpatest.entity4.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CustomerRepository
 *
 * @description 消费者dao
 * @author wangjing
 * @date 2019/6/10 14:45
 * @version v1.0.0
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
