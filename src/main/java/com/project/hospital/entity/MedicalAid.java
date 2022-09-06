package com.project.hospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "medical_aids")
public class MedicalAid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicalAidId;

    private String shortDescription;

    private String longDescription;

    private Double price;
}
