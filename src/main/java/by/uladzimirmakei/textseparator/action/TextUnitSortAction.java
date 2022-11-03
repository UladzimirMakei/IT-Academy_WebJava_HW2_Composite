package by.uladzimirmakei.textseparator.action;

import by.uladzimirmakei.textseparator.entity.TextComponent;

public interface TextUnitSortAction {
    void sortParagraph(TextComponent textComponent);

    void sortSentence(TextComponent textComponent);

    void sortLexeme(TextComponent textComponent);
}
