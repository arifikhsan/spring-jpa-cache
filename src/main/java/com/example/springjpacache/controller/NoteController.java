package com.example.springjpacache.controller;

import com.example.springjpacache.entity.NoteEntity;
import com.example.springjpacache.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/notes")
public class NoteController {
    private final NoteService service;

    @GetMapping
    public Page<NoteEntity> getNotes(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("{id}")
    public NoteEntity getNote(@PathVariable Long id) {
        return service.findOne(id);
    }
}
