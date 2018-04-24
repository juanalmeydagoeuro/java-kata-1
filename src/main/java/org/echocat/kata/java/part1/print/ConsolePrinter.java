package org.echocat.kata.java.part1.print;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ConsolePrinter implements Printer {

    private final List<Printer> printers;

    @Override
    public void print() {
        printers.stream().forEach(Printer::print);
    }
}
