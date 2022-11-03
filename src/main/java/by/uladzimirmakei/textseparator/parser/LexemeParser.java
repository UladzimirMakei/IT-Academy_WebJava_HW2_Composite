package by.uladzimirmakei.textseparator.parser;

import by.uladzimirmakei.textseparator.entity.TextType;

import static by.uladzimirmakei.textseparator.entity.TextType.LEXEME;

public class LexemeParser extends AbstractParser {
    private static final String LEXEME_REGEX = "[\\w]+[.,!?]?";
    private static final TextType TEXT_TYPE = LEXEME;

    @Override
    public String getUnitRegexPattern() {
        return LEXEME_REGEX;
    }

    @Override
    public TextType getTextType() {
        return TEXT_TYPE;
    }
}
