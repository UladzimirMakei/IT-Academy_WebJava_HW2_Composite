package by.uladzimirmakei.textseparator.service.parser;

import by.uladzimirmakei.textseparator.repository.entity.TextType;

import static by.uladzimirmakei.textseparator.repository.entity.TextType.SENTENCE;

public class SentenceParser extends AbstractParser {
    private static final String SENTENCE_REGEX = "[\\w(,)?\\s]+[,.?]";
    private static final TextType TEXT_TYPE = SENTENCE;

    public String getUnitRegexPattern() {
        return SENTENCE_REGEX;
    }

    @Override
    public TextType getTextType() {
        return TEXT_TYPE;
    }
}
