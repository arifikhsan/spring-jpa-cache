package com.example.springjpacache.service;

import com.example.springjpacache.entity.NoteEntity;
import com.example.springjpacache.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository repository;

    @Cacheable("notes")
    public Page<NoteEntity> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Cacheable(value = "notes", key = "#id")
    public NoteEntity findOne(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
