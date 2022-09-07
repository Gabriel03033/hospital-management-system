package com.project.hospital.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobile;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return adminId.equals(admin.adminId) &&
               firstName.equals(admin.firstName) &&
               lastName.equals(admin.lastName) &&
               email.equals(admin.email) &&
               password.equals(admin.password) &&
               mobile.equals(admin.mobile) &&
               address.equals(admin.address) &&;
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminId, firstName, lastName, email, password, mobile, address);
    }
}
