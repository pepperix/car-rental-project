package com.sesame.carrentalprojectback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String marque;

    @Column(nullable = false)
    private String modele;

    @Column(unique = true, nullable = false)
    private String immatriculation;

    private String type;
    private Double prixParJour;
    private Boolean disponibilite;
    private String photoUrl;

    // Relationships

    @OneToMany(mappedBy = "voiture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations;
}