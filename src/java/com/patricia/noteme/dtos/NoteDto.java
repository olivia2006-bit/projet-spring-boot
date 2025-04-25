package src.java.com.patricia.noteme.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto extends TraceBaseDto {

    private int id;

    private String nom;

    private String extention;

    private int taille;

    private Date dateDeCreation;

    private Date dateDerniereModification ;

    private String emprunte;

    private String path;

    private UtilisateurSlimDto utilisateur;

    private DossierSlimDto dossierParent;

}
