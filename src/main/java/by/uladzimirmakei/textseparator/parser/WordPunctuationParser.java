package by.uladzimirmakei.textseparator.parser;

import by.uladzimirmakei.textseparator.entity.TextComposite;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WordPunctuationParser extends AbstractParser {
    private static final Logger logger = LogManager.getLogger();

    private static final String WORD_OR_PUNCTUATION_REGEX = "[\\w]+|[.,!?]?";

    public TextComposite parse(String stringInput) {
        TextComposite resultText = new TextComposite();
        if (isStringNotNullOrEmpty(stringInput)) {
            String[] arraySplit = splitStringToArrayAccordingPattern(stringInput, WORD_OR_PUNCTUATION_REGEX);
            for (String lexeme : arraySplit) {
                TextComposite lexemeUnit = continueParseTextUnit(nextParser, lexeme);
                resultText.add(lexemeUnit);
            }
        } else {
            logger.log(Level.DEBUG, "Input string '{}' is invalid in word parser", stringInput);
        }
        return resultText;
    }
}
