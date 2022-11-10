package by.uladzimirmakei.textseparator.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TextType {
    TEXT(""), PARAGRAPH("\n"), SENTENCE(" "), LEXEME(" "), SYMBOL("");

    private final String delimiter;
}
