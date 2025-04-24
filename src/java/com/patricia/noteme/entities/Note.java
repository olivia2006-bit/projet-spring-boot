package src.java.com.patricia.noteme.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note extends TraceBaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String nom;
    private String extention;
    private int taille;
    private Date dateDeCreation;
    private Date dateDerniereModification ;
    private String emprunte;
    private String path;

    @ManyToOne
    @NotNull(message = "l'utilisateur est obligatoire")
    private Utilisateur utilisateur;

    @ManyToOne
    private Dossier dossierParent;

}
