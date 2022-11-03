package by.uladzimirmakei.textseparator.sortage;

import by.uladzimirmakei.textseparator.entity.TextComponent;

import java.util.Comparator;

public class TextUnitSizeComparator implements Comparator<TextComponent> {

    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        return o2.count() - o1.count();
    }
}
