package org.echocat.kata.java.part1;

import org.echocat.kata.java.part1.factory.FileReaderFactory;
import org.echocat.kata.java.part1.factory.PrinterFactory;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.print.ConsoleBookPrinter;
import org.echocat.kata.java.part1.print.ConsoleMagazinePrinter;

import java.util.List;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class MainApp {

    public static void main(String[] args) {
        List<Book> books = FileReaderFactory.createBookFileReader().readFile("org/echocat/kata/java/part1/data/books.csv");
        List<Magazine> magazines = FileReaderFactory.createMagazineFileReader().readFile("org/echocat/kata/java/part1/data/magazines.csv");

        PrinterFactory.consolePrinterFor(new ConsoleBookPrinter(books), new ConsoleMagazinePrinter(magazines)).print();
        //PrinterFactory.consolePrinterFor(books, magazines).print();
    }


}
