package com.patricia.noteme.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Partage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private String lien;

    private Date dateExpiration;

    @ManyToOne private Utilisateur utilisateurEnvoyeur;
    @ManyToOne private Utilisateur utilisateurReceveur;
    @ManyToOne private Note note;

}
