package com.astrapay.service;

import com.astrapay.entity.Note;
import com.astrapay.repository.NoteRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService() {
        this.noteRepository = new NoteRepository();
    }

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteById(String id){
        return noteRepository.findById(id);
    }

    public Note addNote(String content){
        if (content == null || content.trim().isEmpty()) {
            throw new IllegalArgumentException("Note content cannot be empty");
        }
        return noteRepository.save(new Note(content));
    }

    public Optional<Note> updateNote(String id, String content){
        if(content == null || content.trim().isEmpty()){
            throw new IllegalArgumentException("Note content cannot be empty");
        }
        Optional<Note> existingNote = noteRepository.findById(id);
        if(existingNote.isPresent()){
            existingNote.get().setContent(content);
            return Optional.of(noteRepository.save(existingNote.get()));
        }
        return Optional.empty();
    }

    public boolean deleteNote(String id){
        return noteRepository.delete(id);
    }
}
