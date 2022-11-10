package by.uladzimirmakei.textseparator.service.util;

import by.uladzimirmakei.textseparator.repository.entity.TextComposite;
import by.uladzimirmakei.textseparator.repository.entity.TextType;
import by.uladzimirmakei.textseparator.repository.exception.TextReaderException;
import by.uladzimirmakei.textseparator.service.reader.impl.TextFileReader;
import by.uladzimirmakei.textseparator.service.sortage.impl.TextUnitSortActionImpl;
import by.uladzimirmakei.textseparator.service.writer.impl.TextUnitWriterImpl;

public final class TextUnitUtil {

    private TextUnitUtil() {
    }

    public static String readTextFromFile()
            throws TextReaderException {
        TextFileReader reader = new TextFileReader();
        return reader.read();
    }

    public static void sortTextUnit(
            TextComposite textComposite, TextType textType) {
        TextUnitSortActionImpl sortAction
                = new TextUnitSortActionImpl();
        sortAction.sortTextComposite(textComposite, TextType.PARAGRAPH);
    }

    public static void writeTextUnitToFile(
            TextComposite textComposite) {
        TextUnitWriterImpl writer = new TextUnitWriterImpl();
        writer.write(textComposite);
    }
}
