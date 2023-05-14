package com.cruz.apph2.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "apph2_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String surName;
    private String phone;
    private String address;

}
