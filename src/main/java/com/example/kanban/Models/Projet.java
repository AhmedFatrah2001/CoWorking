package com.example.kanban.Models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "projets")
@Data
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

}