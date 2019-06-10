/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity3
 * @className com.wangjing.jpa.jpatest.entity3.Student
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Student
 *
 * @description 学生（多对一），ManyToOne测试
 * @author wangjing
 * @date 2019/6/10 11:30
 * @version v1.0.0
 */
@Entity
@Table(name = "t_student")
public class Student {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    private int age;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private SchoolClass schoolClass;

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
     * @return the schoolClass
     */
    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    /**
     * @param schoolClass the schoolClass to set
     */
    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
