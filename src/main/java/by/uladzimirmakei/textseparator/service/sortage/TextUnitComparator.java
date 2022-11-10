package by.uladzimirmakei.textseparator.service.sortage;

import by.uladzimirmakei.textseparator.repository.entity.TextComponent;

import java.util.Comparator;

public enum TextUnitComparator implements Comparator<TextComponent> {
    UNIT_SIZE {
        @Override
        public int compare(TextComponent o1, TextComponent o2) {
            return o2.count() - o1.count();
        }
    }
}
