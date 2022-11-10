package by.uladzimirmakei.textseparator.service.reader.impl;

import by.uladzimirmakei.textseparator.repository.exception.TextReaderException;
import by.uladzimirmakei.textseparator.service.reader.ReaderAction;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader implements ReaderAction<String> {
    private static Logger logger = LogManager.getLogger();
    private static final String TEXT_FILE_PATH = "data\\taskText.txt";

    @Override
    public String read() throws TextReaderException {
        logger.log(Level.DEBUG, "FileReader starts to read data from file {}",
                TEXT_FILE_PATH);
        StringBuilder resultString = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(TEXT_FILE_PATH))) {
            String line = reader.readLine();
            while (line != null) {
                resultString.append(line);
                resultString.append("\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            logger.log(Level.ERROR,
                    "TextFileReader unable to read data from file {} {}",
                    TEXT_FILE_PATH, e.getMessage());
            throw new TextReaderException(
                    "TextFileReader unable to read data from file "
                            + TEXT_FILE_PATH, e);
        }
        logger.log(Level.DEBUG, "FileReader finishes reading file.");
        return resultString.toString();
    }
}
