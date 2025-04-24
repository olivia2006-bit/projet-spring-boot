package src.java.com.patricia.noteme.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DossierDto extends TraceBaseDto {

    private int id;

    private String nom;

    private DossierSlimDto dossierParent;

    private UtilisateurSlimDto utilisateur;

}
