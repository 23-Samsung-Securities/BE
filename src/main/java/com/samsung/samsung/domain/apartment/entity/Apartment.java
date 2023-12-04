package com.samsung.samsung.domain.apartment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "apartment_id")
    private Long apartmentId;
    @Column
    private Double longitude;
    @Column
    private Double latitude;
    @Column
    private String address;
    @Column
    private String apartmentName;

}
