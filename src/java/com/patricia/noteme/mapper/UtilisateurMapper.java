package src.java.com.patricia.noteme.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import src.java.com.patricia.noteme.dtos.UtilisateurDto;
import src.java.com.patricia.noteme.dtos.UtilisateurSlimDto;
import src.java.com.patricia.noteme.entities.Utilisateur;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface UtilisateurMapper {

    UtilisateurDto utilisateurToUtilisateurDto(Utilisateur utilisateur);

    Utilisateur UtilisateurDtoToUtilisateur(UtilisateurDto utilisateurDto);

    List<UtilisateurSlimDto> utilisateursToUtilsateurSlimDtos(List<Utilisateur> utilisateurs);

    List<UtilisateurDto> utilisateursToUtilsateurDtos(List<Utilisateur> utilisateurs);

}
