package org.echocat.kata.java.part1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Magazine {

    private final String title;
    private final String isbn;
    private final String author;
    private final String publishedAt;
}
