package org.echocat.kata.java.part1.parser;

public interface LineParser<T> {

    T parseLine(String line);
}
