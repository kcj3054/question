package com.example.demo.Repository;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


//@Entity 하면 자동으로 이것을 db 테이블로 만들어준다
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;


    @Column
    private String name;

    @Column
    private Date joinDate;

    @Column
    private String password;


    @Column
    private String ssn;

}
