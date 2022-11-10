package by.uladzimirmakei.textseparator.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * This enum describes all types of Text composite.
 * String delimiter is used in toString method to reassemble text after parsing.
 */
@Getter
@AllArgsConstructor
public enum TextType {
    TEXT(""), PARAGRAPH("\n"), SENTENCE(" "), LEXEME(" "), SYMBOL("");

    private final String delimiter;
}
