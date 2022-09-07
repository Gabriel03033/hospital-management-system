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
@Table(name = "receptionists")
public class Receptionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long receptionistId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobile;
    private String address;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receptionist receptionist = (Receptionist) o;
        return receptionistId.equals(receptionist.receptionistId) &&
                firstName.equals(receptionist.firstName) &&
                lastName.equals(receptionist.lastName) &&
                email.equals(receptionist.email) &&
                password.equals(receptionist.password) &&
                mobile.equals(receptionist.mobile) &&
                address.equals(receptionist.address) &&
                age.equals(receptionist.age);
    }
    @Override
    public int hashCode() {
        return Objects.hash(receptionistId, firstName, lastName, email, password, mobile, address, age);
    }
}