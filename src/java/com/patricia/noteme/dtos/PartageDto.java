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
public class PartageDto extends TraceBaseDto {

    private int id;

    private String lien;

    private Date dateExpiration;

    private UtilisateurSlimDto utilisateurEnvoyeur;

    private UtilisateurSlimDto utilisateurReceveur;

    private NoteSlimDto note;
}
