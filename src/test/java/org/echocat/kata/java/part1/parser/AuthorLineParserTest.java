package org.echocat.kata.java.part1.parser;

import org.echocat.kata.java.part1.model.Author;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorLineParserTest {

    @Test
    public void whenAuthorLineTextThenGetAuthor() {
        // GIVEN
        String line = "null-walter@echocat.org;Paul;Walter";

        // WHEN
        Author author = new AuthorLineParser().parseLine(line);

        // THEN
        assertEquals(author.getEmail(), "null-walter@echocat.org");
        assertEquals(author.getFirstName(), "Paul");
        assertEquals(author.getLastName(), "Walter");
    }
}
