package org.echocat.kata.java.part1.factory;

import org.echocat.kata.java.part1.file.FileReader;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.parser.AuthorLineParser;
import org.echocat.kata.java.part1.parser.BookLineParser;
import org.echocat.kata.java.part1.parser.MagazineLineParser;

public class FileReaderFactory {

    public static FileReader<Author> createAuthorFileReader() {
        return new FileReader<>(new AuthorLineParser());
    }

    public static FileReader<Book> createBookFileReader() {
        return new FileReader<>(new BookLineParser());
    }

    public static FileReader<Magazine> createMagazineFileReader() {
        return new FileReader<>(new MagazineLineParser());
    }
}
