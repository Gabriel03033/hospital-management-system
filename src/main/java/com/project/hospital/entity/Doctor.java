package com.project.hospital.entity;

import com.project.hospital.enums.Gender;
import com.project.hospital.enums.Grade;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
    @ToString.Exclude
    private List<Specialty> specialties;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "doctors_medical_aids",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "medical_aid_id")
    )
    @ToString.Exclude
    private List<MedicalAid> medicalAids;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return doctorId.equals(doctor.doctorId) &&
                firstName.equals(doctor.firstName) &&
                lastName.equals(doctor.lastName) &&
                email.equals(doctor.email) &&
                password.equals(doctor.password) &&
                age.equals(doctor.age) &&
                gender == doctor.gender &&
                mobile.equals(doctor.mobile) &&
                address.equals(doctor.address) &&
                grade == doctor.grade &&
                yearsOfExperience.equals(doctor.yearsOfExperience) &&
                available.equals(doctor.available) &&
                specialties.equals(doctor.specialties) &&
                medicalAids.equals(doctor.medicalAids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, firstName, lastName, email, password, age, gender, mobile, address, grade, yearsOfExperience, available, specialties, medicalAids);
    }
}
