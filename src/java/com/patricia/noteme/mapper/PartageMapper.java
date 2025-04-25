package src.java.com.patricia.noteme.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import src.java.com.patricia.noteme.dtos.PartageDto;
import src.java.com.patricia.noteme.dtos.PartageSlimDto;
import src.java.com.patricia.noteme.entities.Partage;

import java.util.List;

@Mapper(componentModel = "string", injectionStrategy = InjectionStrategy.FIELD)
public interface PartageMapper {

    PartageDto partageToPartageDto(Partage partage);

    Partage partageDtoToPartage(PartageDto partageDto);

    List<PartageSlimDto> partagesToPartageSlimDtos(List<Partage> partages);

    List<PartageDto> partagesToPartageDtos(List<Partage> partages);

}
