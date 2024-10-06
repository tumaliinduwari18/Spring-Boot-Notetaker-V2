package lk.ijse.gdse68.notetrakerv2.service;



import lk.ijse.gdse68.notetrakerv2.customObj.NoteResponse;
import lk.ijse.gdse68.notetrakerv2.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    void saveNote();

    void saveNote(NoteDTO noteDTO);
    void updateNote(String noteId,NoteDTO noteDTO);
    boolean deleteNote(String noteId);
    NoteResponse getSelectedNote(String noteId);
    List<NoteDTO> getAllNotes();
}
