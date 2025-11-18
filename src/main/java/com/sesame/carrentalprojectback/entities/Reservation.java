package com.sesame.carrentalprojectback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Double montantTotal;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    // Relationships

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Voiture voiture;
}
