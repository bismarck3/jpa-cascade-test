/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity
 * @className com.wangjing.jpa.jpatest.entity.UserAddress
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity;
/**
 * UserAddress
 *
 * @description 用户+地址
 * @author wangjing
 * @date 2019/6/6 17:07
 * @version v1.0.0
 */
public class UserAddress {

    private User user;

    private Address address;

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public UserAddress(User user, Address address) {
        this.user = user;
        this.address = address;
    }

    public UserAddress(Address address, User user) {
        this.user = user;
        this.address = address;
    }
}
