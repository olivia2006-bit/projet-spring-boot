package src.java.com.patricia.noteme.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import src.java.com.patricia.noteme.dtos.NoteDto;
import src.java.com.patricia.noteme.dtos.NoteSlimDto;
import src.java.com.patricia.noteme.entities.Note;

import java.util.List;

@Mapper(componentModel = "string", injectionStrategy = InjectionStrategy.FIELD)
public interface NoteMapper {

    NoteDto noteToNoteDto(Note note);

    Note noteDtoToNote(NoteDto noteDto);

    List<NoteDto> notesToNoteDtos(List<Note> notes);

    List<NoteSlimDto> notesDtoToNoteSlimDtos(List<Note> notes);

}
