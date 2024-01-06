package com.Numetry.Notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.Numetry.Notes.entity.Note;

@RestController
public interface NoteRepository extends JpaRepository<Note, Long> {

}
