package com.astrapay.repository;

import com.astrapay.entity.Note;

import java.util.*;

public class NoteRepository {
    private final Map<String, Note> notes = new HashMap<>();

    public List<Note> findAll(){
        return new ArrayList<>(notes.values());
    }

    public Note save(Note note){
        notes.put(note.getId(), note);
        return note;
    }

    public boolean delete(String id){
        return notes.remove(id) != null;
    }

    public Optional<Note> findById(String id){
        return Optional.ofNullable(notes.get(id));
    }
}
