/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.repository
 * @className com.wangjing.jpa.jpatest.repository.AddressRepository
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.repository;

    import com.wangjing.jpa.jpatest.entity.Address;
    import com.wangjing.jpa.jpatest.entity.UserAddress;
    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.Pageable;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;

/**
 * AddressRepository
 *
 * @description 用户地址dao
 * @author wangjing
 * @date 2019/6/6 16:52
 * @version v1.0.0
 */
public interface AddressRepository extends JpaRepository<Address, String> {

    @Query("SELECT new com.wangjing.jpa.jpatest.entity.UserAddress(a, u) FROM User u, Address a")
    Page<UserAddress> findAllAddressUser(Pageable pageable);
}
