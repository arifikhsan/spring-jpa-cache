package com.example.springjpacache.repository;

import com.example.springjpacache.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> { }
