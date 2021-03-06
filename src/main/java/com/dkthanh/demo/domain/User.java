package com.dkthanh.demo.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@ToString
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer userId;


    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;
}
