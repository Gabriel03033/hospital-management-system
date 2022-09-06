package com.project.hospital.entity;

import com.project.hospital.enums.SpecialtyType;
import javax.persistence.*;

@Entity
@Table(name = "specialties")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specialtyId;

    @Enumerated(EnumType.STRING)
    private SpecialtyType specialtyType;

    private String description;
}
