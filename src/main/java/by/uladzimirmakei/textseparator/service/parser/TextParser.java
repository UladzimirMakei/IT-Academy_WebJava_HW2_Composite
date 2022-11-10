package by.uladzimirmakei.textseparator.service.parser;

import by.uladzimirmakei.textseparator.repository.entity.TextType;

import static by.uladzimirmakei.textseparator.repository.entity.TextType.TEXT;

public class TextParser extends AbstractParser {
    private static final String TEXT_REGEX
            = "(\\s?[a-zA-Z(,)?\\s?]+[a-zA-Z][.?!])+";
    private static final TextType TEXT_TYPE = TEXT;

    @Override
    public String getUnitRegexPattern() {
        return TEXT_REGEX;
    }

    @Override
    public TextType getTextType() {
        return TEXT_TYPE;
    }
}
