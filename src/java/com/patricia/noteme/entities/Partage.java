package src.java.com.patricia.noteme.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Partage extends TraceBaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private String lien;

    private Date dateExpiration;

    @ManyToOne
    @NotNull
    private Utilisateur utilisateurEnvoyeur;

    @ManyToOne
    @NotNull
    private Utilisateur utilisateurReceveur;

    @ManyToOne
    @NotNull
    private Note note;

}
