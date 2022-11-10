package by.uladzimirmakei.textseparator.service.parser;

import by.uladzimirmakei.textseparator.repository.entity.TextComposite;
import by.uladzimirmakei.textseparator.repository.entity.TextType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractParser {
    protected AbstractParser nextParser;

    public void setNextParser(AbstractParser nextParser) {
        this.nextParser = nextParser;
    }

    public abstract String getUnitRegexPattern();

    public abstract TextType getTextType();

    /**
     * Parses required string to Composite objects TextComposite.
     * If next parser is set (!= null) -
     * continues parsing according to chain of responsibility.
     * If next parser is not set -
     * returns Composite object according to regex pattern.
     *
     * @param parseString Input String to parse.
     * @return Composite object TextComposite.
     * @see TextComposite#TextComposite
     */
    public TextComposite parse(String parseString) {
        Pattern pattern = Pattern.compile(getUnitRegexPattern());
        Matcher matcher = pattern.matcher(parseString);
        TextComposite currentTextComposite =
                new TextComposite(getTextType());
        while (matcher.find()) {
            if (nextParser != null) {
                TextComposite childTextComposite =
                        nextParser.parse(matcher.group());
                currentTextComposite.add(childTextComposite);
            } else {
                currentTextComposite.add(matcher.group());
            }
        }
        return currentTextComposite;
    }
}
