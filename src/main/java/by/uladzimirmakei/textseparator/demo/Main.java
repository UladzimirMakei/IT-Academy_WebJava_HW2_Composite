package by.uladzimirmakei.textseparator.demo;

import by.uladzimirmakei.textseparator.action.impl.TextUnitSortActionImpl;
import by.uladzimirmakei.textseparator.entity.TextComposite;
import by.uladzimirmakei.textseparator.exception.TextReaderException;
import by.uladzimirmakei.textseparator.parser.*;
import by.uladzimirmakei.textseparator.reader.impl.TextFileReader;
import by.uladzimirmakei.textseparator.writer.impl.TextUnitWriterImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();
        try {
            String stringFromDocument = reader.read();
            TextParser textParser = new TextParser();
            ParagraphParser paragraphParser = new ParagraphParser();
            SentenceParser sentenceParser = new SentenceParser();
            LexemeParser lexemeParser = new LexemeParser();
            SymbolParser symbolParser = new SymbolParser();
            textParser.setNextParser(paragraphParser);
            paragraphParser.setNextParser(sentenceParser);
            sentenceParser.setNextParser(lexemeParser);
            lexemeParser.setNextParser(symbolParser);
            TextComposite textComposite = textParser.parse(stringFromDocument);
            TextUnitSortActionImpl sortAction = new TextUnitSortActionImpl();
            sortAction.sortParagraph(textComposite);
            TextUnitWriterImpl writer = new TextUnitWriterImpl();
            writer.write(textComposite);
        } catch (TextReaderException e) {
            logger.log(Level.ERROR, "Exception is caught in program {}", e.getMessage());
        }
    }
}