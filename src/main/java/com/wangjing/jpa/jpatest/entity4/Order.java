/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity4
 * @className com.wangjing.jpa.jpatest.entity4.Order
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity4;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Order
 *
 * @description 订单-ManyToMany
 * @author wangjing
 * @date 2019/6/10 14:11
 * @version v1.0.0
 */
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue
    private String id;

    private double price;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_customer_order", joinColumns = {@JoinColumn(name="order_id")},
        inverseJoinColumns = @JoinColumn(name = "customer_id"))
    private Set<Customer> customerSet = new HashSet<>();

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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the customerSet
     */
    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    /**
     * @param customerSet the customerSet to set
     */
    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }
}
