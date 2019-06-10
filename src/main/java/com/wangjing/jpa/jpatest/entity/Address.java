/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity
 * @className com.wangjing.jpa.jpatest.entity.Address3
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Address3
 *
 * @description 用户地址
 * @author wangjing
 * @date 2019/6/6 16:50
 * @version v1.0.0
 */
@Table(name = "t_address")
@Entity
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

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
}
