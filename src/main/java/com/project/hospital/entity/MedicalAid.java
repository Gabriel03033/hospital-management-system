package com.project.hospital.entity;

import java.util.Objects;
import javax.persistence.Entity;
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
@Table(name = "medical_aids")
public class MedicalAid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicalAidId;

    private String shortDescription;

    private String longDescription;

    private Double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalAid that = (MedicalAid) o;
        return medicalAidId.equals(that.medicalAidId) &&
                shortDescription.equals(that.shortDescription) &&
                longDescription.equals(that.longDescription) &&
                price.equals(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalAidId, shortDescription, longDescription, price);
    }
}
