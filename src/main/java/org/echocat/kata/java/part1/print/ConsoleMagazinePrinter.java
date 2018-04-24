package org.echocat.kata.java.part1.print;

import lombok.AllArgsConstructor;
import org.echocat.kata.java.part1.model.Magazine;

import java.util.List;

@AllArgsConstructor
public class ConsoleMagazinePrinter implements Printer {

    private final List<Magazine> magazines;

    @Override
    public void print() {
        magazines.stream().forEach(magazine -> System.out.printf("Magazine: %s isbn: %s author: %s%n", magazine.getTitle(), magazine.getIsbn(), magazine.getAuthor()));
    }
}
