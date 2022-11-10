package by.uladzimirmakei.textseparator.service.sortage;

import by.uladzimirmakei.textseparator.repository.entity.TextComponent;
import by.uladzimirmakei.textseparator.repository.entity.TextType;

/**
 * This interface is used for sorting Composite text unit.
 * TextType parameter is used to
 * clarify in what separate units you want sorting.
 */
public interface TextUnitSortAction {

    void sortTextComposite(TextComponent textComponent, TextType unitType);

}
