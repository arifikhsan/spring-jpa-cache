package com.example.springjpacache.entity;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Builder
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "notes")
public class NoteEntity extends BaseEntity {
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;
}
