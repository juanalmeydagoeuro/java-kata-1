package org.echocat.kata.java.part1.file;

import lombok.AllArgsConstructor;
import org.echocat.kata.java.part1.parser.LineParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public class FileReader<T> {

    private final LineParser<T> lineParser;

    public List<T> readFile(String filePath) {
        try (Stream<String> stream = doRead(filePath)) {
            return stream
                    .skip(1) // skip first line
                    .map(line -> lineParser.parseLine(line))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(String.format("File cannot be read %s", filePath), e);
        } // no need of finally block since it is done already on the file reader library
    }

    private Stream<String> doRead(String fileName) throws IOException {
        return Files.lines(Paths.get(getClass().getClassLoader().getResource(fileName).getPath()));
    }
}
