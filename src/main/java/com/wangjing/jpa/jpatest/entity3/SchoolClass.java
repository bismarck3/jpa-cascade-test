/**
 * @projectName jpa-test
 * @package com.wangjing.jpa.jpatest.entity3
 * @className com.wangjing.jpa.jpatest.entity3.SchoolClass
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.jpa.jpatest.entity3;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * SchoolClass
 *
 * @description 班级
 * @author wangjing
 * @date 2019/6/10 11:32
 * @version v1.0.0
 */
@Table(name = "t_class")
@Entity
public class SchoolClass {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    @OneToMany(mappedBy = "schoolClass", fetch = FetchType.EAGER)
    private Set<Student> students = new HashSet<>();

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
     * @return the students
     */
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
