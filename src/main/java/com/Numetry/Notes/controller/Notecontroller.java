package com.Numetry.Notes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Numetry.Notes.entity.Note;
import com.Numetry.Notes.service.NoteService;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class Notecontroller {
	 @Autowired
	    private NoteService noteService;

	    @GetMapping
	    public List<Note> getAllNotes() {
	        return noteService.getAllNotes();
	    }

	    @GetMapping("/{id}")
	    public Note getNoteById(@PathVariable Long id) {
	        return noteService.getNoteById(id).orElse(null);
	    }

	    @PostMapping
	    public Note createNote(@RequestBody Note note) {
	        return noteService.saveOrUpdateNote(note);
	    }

	    @PutMapping("/{id}")
	    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
	        note.setId(id);
	        return noteService.saveOrUpdateNote(note);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteNote(@PathVariable Long id) {
	        noteService.deleteNoteById(id);
	    }
}
