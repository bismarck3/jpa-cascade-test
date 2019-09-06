/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity4
 * @className com.wangjing.jpa.jpatest.entity4.Customer
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity4;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer
 *
 * @description 订单用户-ManyToMany
 * @author wangjing
 * @date 2019/6/10 14:32
 * @version v1.0.0
 */
@Entity
@Table(name = "t_customer")
public class Customer {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    @ManyToMany(mappedBy = "customerSet", fetch = FetchType.EAGER)
    private Set<Order> orderSet = new HashSet<>();

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
     * @return the orderSet
     */
    public Set<Order> getOrderSet() {
        return orderSet;
    }

    /**
     * @param orderSet the orderSet to set
     */
    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}
