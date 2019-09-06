/**
 * @projectName jpa-cascade-test
 * @package com.wangjing.jpa.jpatest.entity
 * @className com.wangjing.jpa.jpatest.entity.UserVO
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity;

/**
 * UserVO
 *
 * @description 
 * @author wangjing
 * @date 2019/9/6 10:59
 * @version 
 */
public class UserVO {

    private String id;

    private String name;

    private int age;

    private String addressName;

    public UserVO() {
    }

    public UserVO(String id, String name, int age, String addressName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addressName = addressName;
    }

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
}
