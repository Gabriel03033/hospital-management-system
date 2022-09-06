package com.project.hospital.entity;

import com.project.hospital.enums.SpecialtyType;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "specialties")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specialtyId;

    @Enumerated(EnumType.STRING)
    private SpecialtyType specialtyType;

    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialty specialty = (Specialty) o;
        return specialtyId.equals(specialty.specialtyId) &&
                specialtyType == specialty.specialtyType &&
                description.equals(specialty.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialtyId, specialtyType, description);
    }
}
