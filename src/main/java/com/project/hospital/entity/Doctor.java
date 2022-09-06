package com.project.hospital.entity;

import com.project.hospital.enums.Gender;
import com.project.hospital.enums.Grade;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobile;

    private String address;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    private Integer yearsOfExperience;

    private Boolean available;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "doctors_specialties",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id")
    )
    private List<Specialty> specialties;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "doctors_medical_aids",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "medical_aid_id")
    )
    private List<MedicalAid> medicalAids;
}
