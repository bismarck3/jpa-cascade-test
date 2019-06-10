package com.wangjing.jpa.jpatest.entity2;/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity
 * @className com.wangjing.jpa.jpatest.entity.User3
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User3
 *
 * @description 用户实体，jpa-oneToOne测试
 * @author wangjing
 * @date 2019/6/6 16:18
 * @version v1.0.0
 */
@Table(name = "t_user")
@Entity
public class User2 {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private String id;

    private String name;

    private int age;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address2 address;


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public Address2 getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address2 address) {
        this.address = address;
    }
}
