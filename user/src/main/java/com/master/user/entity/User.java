package com.master.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 50)
    private String name;

    @Column(length = 50)
    private String username;

    @Column
    private String password;

    @Column(length = 11)
    private String phone;

    @Column(length = 100)
    private String email;

    @Column(length = 50)
    private String avatar;

}
