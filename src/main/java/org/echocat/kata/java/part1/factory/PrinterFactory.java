package org.echocat.kata.java.part1.factory;

import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.print.ConsoleBookPrinter;
import org.echocat.kata.java.part1.print.ConsoleMagazinePrinter;
import org.echocat.kata.java.part1.print.ConsolePrinter;
import org.echocat.kata.java.part1.print.Printer;

import java.util.Arrays;
import java.util.List;

public class PrinterFactory {

    public static ConsolePrinter consolePrinterFor(List<Book> books, List<Magazine> magazines) {
        return new ConsolePrinter(Arrays.asList(new ConsoleBookPrinter(books), new ConsoleMagazinePrinter(magazines)));
    }

    public static ConsolePrinter consolePrinterFor(Printer... printers) {
        return new ConsolePrinter(Arrays.asList(printers));
    }
}
