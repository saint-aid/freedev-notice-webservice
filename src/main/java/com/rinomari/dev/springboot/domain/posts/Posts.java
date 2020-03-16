package com.rinomari.dev.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String tilte;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String tilte, String content, String author) {
        this.tilte = tilte;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.tilte = title;
        this.content = content;
    }
}
