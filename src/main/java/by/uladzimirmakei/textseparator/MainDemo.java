package by.uladzimirmakei.textseparator;

import by.uladzimirmakei.textseparator.repository.entity.TextComposite;
import by.uladzimirmakei.textseparator.repository.entity.TextType;
import by.uladzimirmakei.textseparator.repository.exception.TextReaderException;
import by.uladzimirmakei.textseparator.service.parser.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static by.uladzimirmakei.textseparator.service.util.TextUnitUtil.*;

public class MainDemo {
    private static Logger logger = LogManager.getLogger();

    private MainDemo() {
    }

    public static void main(String[] args) {
        try {
            String stringFromDocument = readTextFromFile();

            TextParser textParser = new TextParser();
            ParagraphParser paragraphParser = new ParagraphParser();
            SentenceParser sentenceParser = new SentenceParser();
            LexemeParser lexemeParser = new LexemeParser();
            SymbolParser symbolParser = new SymbolParser();
            textParser.setNextParser(paragraphParser);
            paragraphParser.setNextParser(sentenceParser);
            sentenceParser.setNextParser(lexemeParser);
            lexemeParser.setNextParser(symbolParser);

            TextComposite textComposite = textParser
                    .parse(stringFromDocument);

            sortTextUnit(textComposite, TextType.PARAGRAPH);
            writeTextUnitToFile(textComposite);
        } catch (TextReaderException e) {
            logger.log(Level.ERROR, "Exception is caught in program {}",
                    e.getMessage());
        }
    }
}
