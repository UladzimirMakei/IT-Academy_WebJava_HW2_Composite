package by.uladzimirmakei.textseparator.entity;

public enum TextType {
    TEXT(""), PARAGRAPH("\n"), SENTENCE(" "), LEXEME(" "), SYMBOL("");

    private String delimiter;

    public String getDelimiter() {
        return delimiter;
    }

    TextType(String delimiter) {
        this.delimiter = delimiter;
    }
}
