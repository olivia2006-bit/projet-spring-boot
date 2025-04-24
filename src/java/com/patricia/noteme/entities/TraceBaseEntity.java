package src.java.com.patricia.noteme.entities;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class TraceBaseEntity {
    //attributs de traçabilité

    @NotEmpty
    private String creerPar;

    @NotEmpty
    private String modifierPar;

    @NotEmpty
    private Date creerLe;

    @NotEmpty
    private Date modifierLe;
}
