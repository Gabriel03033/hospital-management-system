package com.project.hospital.entity;

import com.project.hospital.enums.Gender;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String mobile;
    private String address;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
