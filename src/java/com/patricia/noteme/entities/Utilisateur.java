package src.java.com.patricia.noteme.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Utilisateur extends TraceBaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty
    private String nom;

    @Column(unique = true)
    @Email
    @NotEmpty
    private String email;

    //restriction sur le mot de passe
    @NotBlank (message = "Le mot de passe est obligatoire")
    @Size (min = 8, max = 15, message = "Le mot de passe doit contenir entre 8 et 15 caractères")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*])$", message = "Le mot de passe doit contenir au moins une majuscule, une minuscule, un chiffre et un caractère spécial")
    private String password;

}
