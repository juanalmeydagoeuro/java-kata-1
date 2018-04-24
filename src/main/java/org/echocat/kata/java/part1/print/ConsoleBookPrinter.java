package org.echocat.kata.java.part1.print;

import lombok.AllArgsConstructor;
import org.echocat.kata.java.part1.model.Book;

import java.util.List;

@AllArgsConstructor
public class ConsoleBookPrinter implements Printer {

    private final List<Book> books;

    @Override
    public void print() {
        books.stream().forEach(book -> System.out.printf("Book %s isbn: %s author: %s%n", book.getTitle(), book.getIsbn(), book.getAuthor()));
    }
}
