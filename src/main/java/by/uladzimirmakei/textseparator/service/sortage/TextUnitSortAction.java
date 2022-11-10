package by.uladzimirmakei.textseparator.service.sortage;

import by.uladzimirmakei.textseparator.repository.entity.TextComponent;
import by.uladzimirmakei.textseparator.repository.entity.TextType;

public interface TextUnitSortAction {

    void sortTextUnit(TextComponent textComponent, TextType unitType);

}
