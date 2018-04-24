package org.echocat.kata.java.part1.parser;

import org.echocat.kata.java.part1.model.Author;

public class AuthorLineParser implements LineParser<Author> {

    public Author parseLine(String line) {
        try {
            String[] splittedLine = line.split(";");
            return new Author(splittedLine[0], splittedLine[1], splittedLine[2]);
        } catch (Exception e) {
            System.out.printf("Incorrect line in the file: %s%n", line);
            return null;
        }
    }
}
