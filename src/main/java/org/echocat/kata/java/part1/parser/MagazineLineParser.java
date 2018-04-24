package org.echocat.kata.java.part1.parser;

import org.echocat.kata.java.part1.model.Magazine;

public class MagazineLineParser implements LineParser<Magazine> {

    public Magazine parseLine(String line) {
        try {
            String[] splittedLine = line.split(";");
            return new Magazine(splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3]);
        } catch (Exception e) {
            System.out.printf("Incorrect line in the file: %s%n", line);
            return null;
        }
    }
}
