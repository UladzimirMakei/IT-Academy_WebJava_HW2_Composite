package by.uladzimirmakei.textseparator.service.parser;

import by.uladzimirmakei.textseparator.repository.entity.TextComposite;
import by.uladzimirmakei.textseparator.repository.entity.TextType;

import static by.uladzimirmakei.textseparator.repository.entity.TextType.*;

public class SymbolParser extends AbstractParser {
    private static final TextType TEXT_TYPE = SYMBOL;

    @Override
    public String getUnitRegexPattern() {
        return null;
    }

    @Override
    public TextType getTextType() {
        return TEXT_TYPE;
    }

    @Override
    public TextComposite parse(String stringInput) {
        TextComposite resultText = new TextComposite(getTextType());
        char[] arraySplit = stringInput.toCharArray();
        for (char symbol : arraySplit) {
            TextComposite symbolUnit =
                    new TextComposite(String.valueOf(symbol), getTextType());
            resultText.add(symbolUnit);
        }
        return resultText;
    }
}
