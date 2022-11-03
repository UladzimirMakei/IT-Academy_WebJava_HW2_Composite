package by.uladzimirmakei.textseparator.action.impl;

import by.uladzimirmakei.textseparator.action.TextUnitSortAction;
import by.uladzimirmakei.textseparator.entity.TextComponent;
import by.uladzimirmakei.textseparator.entity.TextType;
import by.uladzimirmakei.textseparator.sortage.TextUnitSizeComparator;

import java.util.List;

public class TextUnitSortActionImpl implements TextUnitSortAction {
    private static TextUnitSortAction sortAction = new TextUnitSortActionImpl();

    @Override
    public void sortParagraph(TextComponent textComponent) {
        for (TextComponent unit : textComponent.getCompositeText()) {
            if (unit.getTextType().equals(TextType.PARAGRAPH)) {
                List<TextComponent> listText = unit.getCompositeText();
                listText.sort(new TextUnitSizeComparator());
                unit.setCompositeText(listText);
            } else {
                sortAction.sortParagraph(unit);
            }
        }
    }

    @Override
    public void sortSentence(TextComponent textComponent) {
        for (TextComponent unit : textComponent.getCompositeText()) {
            if (unit.getTextType().equals(TextType.SENTENCE)) {
                List<TextComponent> listText = unit.getCompositeText();
                listText.sort(new TextUnitSizeComparator());
                unit.setCompositeText(listText);
            } else {
                sortAction.sortSentence(unit);
            }
        }
    }

    @Override
    public void sortLexeme(TextComponent textComponent) {
        for (TextComponent unit : textComponent.getCompositeText()) {
            if (unit.getTextType().equals(TextType.LEXEME)) {
                List<TextComponent> listText = unit.getCompositeText();
                listText.sort(new TextUnitSizeComparator());
                unit.setCompositeText(listText);
            } else {
                sortAction.sortLexeme(unit);
            }
        }
    }
}
