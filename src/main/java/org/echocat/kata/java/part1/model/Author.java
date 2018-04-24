package org.echocat.kata.java.part1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Author {

    private final String email;
    private final String firstName;
    private final String lastName;
}
