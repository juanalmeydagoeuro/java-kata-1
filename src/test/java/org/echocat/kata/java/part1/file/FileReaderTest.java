package org.echocat.kata.java.part1.file;

import org.echocat.kata.java.part1.factory.FileReaderFactory;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Magazine;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Test
    public void whenAuthorFileOfOneLineThenGetAuthor() {
        // GIVEN
        String fileName = "file/author/oneLineAuthor.csv";

        // WHEN
        List<Author> authors = FileReaderFactory.createAuthorFileReader().readFile(fileName);

        // THEN
        assertEquals(authors.size(), 1);

        Author author1 = authors.get(0);
        assertEquals(author1.getEmail(), "null-walter@echocat.org");
        assertEquals(author1.getFirstName(), "Paul");
        assertEquals(author1.getLastName(), "Walter");
    }

    @Test
    public void whenAuthorFileOfTwoLinesThenGetTwoAuthors() {
        // GIVEN
        String fileName = "file/author/twoLinesAuthor.csv";

        // WHEN
        List<Author> authors = FileReaderFactory.createAuthorFileReader().readFile(fileName);

        // THEN
        assertEquals(authors.size(), 2);

        Author author1 = authors.get(0);
        assertEquals(author1.getEmail(), "null-walter@echocat.org");
        assertEquals(author1.getFirstName(), "Paul");
        assertEquals(author1.getLastName(), "Walter");

        Author author2 = authors.get(1);
        assertEquals(author2.getEmail(), "null-mueller@echocat.org");
        assertEquals(author2.getFirstName(), "Max");
        assertEquals(author2.getLastName(), "Müller");
    }

    @Test
    public void whenBookFileOfOneLineThenGetBook() {
        // GIVEN
        String fileName = "file/book/oneLineBook.csv";

        // WHEN
        List<Book> books = FileReaderFactory.createBookFileReader().readFile(fileName);

        // THEN
        assertEquals(books.size(), 1);

        Book book = books.get(0);
        assertEquals(book.getAuthor(), "null-walter@echocat.org");
        assertEquals(book.getDescription(), "Auf der Suche nach einem Basiskochbuch steht man heutzutage vor einer Fülle von Alternativen. Es fällt schwer, daraus die für sich passende Mixtur aus Grundlagenwerk und Rezeptesammlung zu finden. Man sollte sich darüber im Klaren sein, welchen Schwerpunkt man setzen möchte oder von welchen Koch- und Backkenntnissen man bereits ausgehen kann.");
        assertEquals(book.getIsbn(), "5554-5545-4518");
        assertEquals(book.getTitle(), "Ich helfe dir kochen. Das erfolgreiche Universalkochbuch mit großem Backteil");
    }

    @Test
    public void whenBookFileOfTwoLinesThenGetTwoBooks() {
        // GIVEN
        String fileName = "file/book/twoLinesBook.csv";

        // WHEN
        List<Book> books = FileReaderFactory.createBookFileReader().readFile(fileName);

        // THEN
        assertEquals(books.size(), 2);

        Book book1 = books.get(0);
        assertEquals(book1.getAuthor(), "null-walter@echocat.org");
        assertEquals(book1.getDescription(), "Auf der Suche nach einem Basiskochbuch steht man heutzutage vor einer Fülle von Alternativen. Es fällt schwer, daraus die für sich passende Mixtur aus Grundlagenwerk und Rezeptesammlung zu finden. Man sollte sich darüber im Klaren sein, welchen Schwerpunkt man setzen möchte oder von welchen Koch- und Backkenntnissen man bereits ausgehen kann.");
        assertEquals(book1.getIsbn(), "5554-5545-4518");
        assertEquals(book1.getTitle(), "Ich helfe dir kochen. Das erfolgreiche Universalkochbuch mit großem Backteil");

        Book book2 = books.get(1);
        assertEquals(book2.getAuthor(), "null-walter@echocat.org");
        assertEquals(book2.getDescription(), "Aller Anfang ist leicht! Zumindest, wenn man beim Kochenlernen einen Lehrer wie Alfons Schuhbeck zur Seite hat. Mit seiner Hilfe kann auch der ungeschickteste Anfänger beste Noten für seine Gerichte bekommen. Der Trick, den der vielfach ausgezeichnete Meisterkoch dabei anwendet, lautet visualisieren. Die einzelnen Arbeitsschritte werden auf Farbfotos im Format von ca. 3x4 cm abgebildet. Unter diesen stehen kurz und knapp die Angaben zur Zubereitung. So präsentiert Schuhbecks Kochschule alles bequem auf einen Blick. Und der interessierte Kochneuling kann sich auf die Hauptsache konzentrieren – aufs Kochen. Wie die Speise aussehen soll, zeigt jeweils das Farbfoto auf der linken Seite, auf der auch die Zutaten – dank des geschickten Layouts – ebenfalls sehr übersichtlich aufgelistet sind. Außerdem gibt Schuhbeck prägnante Empfehlungen zu Zutaten und Zubereitung.");
        assertEquals(book2.getIsbn(), "1215-4545-5895");
        assertEquals(book2.getTitle(), "Schuhbecks Kochschule. Kochen lernen mit Alfons Schuhbeck ");
    }

    @Test
    public void whenMagazineFileOfSixLinesThenGetTwoBooks() {
        // GIVEN
        String fileName = "file/magazine/sixLinesMagazine.csv";

        // WHEN
        List<Magazine> magazines = FileReaderFactory.createMagazineFileReader().readFile(fileName);

        // THEN
        assertEquals(magazines.size(), 6);

        Magazine magazine = magazines.get(0);
        assertEquals(magazine.getAuthor(), "null-walter@echocat.org");
        assertEquals(magazine.getPublishedAt(), "21.05.2011");
        assertEquals(magazine.getIsbn(), "5454-5587-3210");
        assertEquals(magazine.getTitle(), "Beautiful cooking");
    }

}
