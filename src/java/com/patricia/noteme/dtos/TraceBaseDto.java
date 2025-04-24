package src.java.com.patricia.noteme.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class TraceBaseDto {
    //attributs de traçabilité

    private String creerPar;

    private String modifierPar;

    private Date creerLe;

    private Date modifierLe;
}
