package by.uladzimirmakei.textseparator.writer.impl;

import by.uladzimirmakei.textseparator.entity.TextComposite;
import by.uladzimirmakei.textseparator.writer.TextUnitWriter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextUnitWriterImpl implements TextUnitWriter<TextComposite> {
    private static final Logger logger = LogManager.getLogger();
    private static final String RESULT_FILE_PATH = "data\\result.txt";

    @Override
    public void write(TextComposite input) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(RESULT_FILE_PATH)))) {
            writer.println(input);
        } catch (IOException e) {
            logger.log(Level.ERROR, "Text unit writer unable to write data to file {} {}", RESULT_FILE_PATH, e.getMessage());
        }
    }
}
