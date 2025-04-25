package src.java.com.patricia.noteme.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import src.java.com.patricia.noteme.dtos.DossierDto;
import src.java.com.patricia.noteme.dtos.DossierSlimDto;
import src.java.com.patricia.noteme.entities.Dossier;

import java.util.List;

@Mapper(componentModel = "string",injectionStrategy = InjectionStrategy.FIELD)
public interface DossierMapper {

    DossierDto dossierToDossierDto(Dossier dossier);

    Dossier dossierDtoToDossier(DossierDto dossierDto);

    List<DossierSlimDto> dossiersToDossierSlimDtos(List<Dossier> dossiers);

    List<DossierDto> dossiersToDossierDtos(List<Dossier> dossiers);

}
