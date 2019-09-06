package com.wangjing.jpa.jpatest;

import com.wangjing.jpa.jpatest.entity.UserAddress;
import com.wangjing.jpa.jpatest.entity.UserVO;
import com.wangjing.jpa.jpatest.entity2.User2;
import com.wangjing.jpa.jpatest.entity3.Student;
import com.wangjing.jpa.jpatest.entity4.Customer;
import com.wangjing.jpa.jpatest.repository.CustomerRepository;
import com.wangjing.jpa.jpatest.repository.StudentRepository;
import com.wangjing.jpa.jpatest.repository.UserRepository;
import com.wangjing.jpa.jpatest.repository.UserRepository2;
import com.wangjing.jpa.jpatest.repository.UserVORepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTestApplicationTests {

    @Autowired
    private UserRepository userRepositoryNew;

    @Autowired
    private UserRepository2 userRepositoryOnToMany;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private UserVORepository userVORepository;

    @Ignore
    @Test
    public void contextLoads() {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Page<User2> allUserAddress = userRepositoryOnToMany.findAll(PageRequest.of(0, 1,sort));
        for (User2 user : allUserAddress) {
            System.out.println(user);
        }

    }

    @Ignore
    @Test
    public void testUserAddress() {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Page<UserAddress> allUserAddress = userRepositoryNew.findAllUserAddress(PageRequest.of(0, 1, sort));
        for (UserAddress userAddress : allUserAddress) {
            System.out.println(userAddress);
        }

    }

    @Ignore
    @Test
    public void testManyToOne(){
        Page<Student> students = studentRepository.findAll(PageRequest.of(1,1));
//        List<Student> students = studentRepository.findAll();
        students.forEach(System.out::println);
    }

    @Ignore
    @Test
    public void testManyToMany(){
        List<Customer> customers = customerRepository.findAll();
        customers.forEach(System.out::println);
    }

    @Test
    public void testUserVO(){
        for (UserVO allUserAddress : userVORepository.findAllUserAddress()) {
            System.out.println(allUserAddress);
        }
    }
}
