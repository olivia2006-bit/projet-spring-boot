package src.java.com.patricia.noteme.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DossierSlimDto {

    private int id;

    private String nom;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UtilisateurDto extends TraceBaseDto {
        private int id;

        private String nom;

        private String email;

        private String password;
    }
}
