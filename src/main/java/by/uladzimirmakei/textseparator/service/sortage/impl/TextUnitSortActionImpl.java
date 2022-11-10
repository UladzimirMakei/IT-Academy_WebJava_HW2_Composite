package by.uladzimirmakei.textseparator.service.sortage.impl;

import by.uladzimirmakei.textseparator.repository.entity.TextComponent;
import by.uladzimirmakei.textseparator.repository.entity.TextType;
import by.uladzimirmakei.textseparator.service.sortage.TextUnitComparator;
import by.uladzimirmakei.textseparator.service.sortage.TextUnitSortAction;

import java.util.List;

public class TextUnitSortActionImpl implements TextUnitSortAction {
    @Override
    public void sortTextUnit(TextComponent textComponent, TextType unitType) {
        TextUnitSortAction sortAction = new TextUnitSortActionImpl();
        for (TextComponent unit : textComponent.getCompositeText()) {
            if (unit.getTextType().equals(unitType)) {
                List<TextComponent> listText = unit.getCompositeText();
                listText.sort(TextUnitComparator.UNIT_SIZE);
                unit.setCompositeText(listText);
            } else {
                sortAction.sortTextUnit(unit, unitType);
            }
        }
    }
}
