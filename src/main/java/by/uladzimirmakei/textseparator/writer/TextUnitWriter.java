package by.uladzimirmakei.textseparator.writer;

import by.uladzimirmakei.textseparator.exception.WriteFileException;

public interface TextUnitWriter<T> {
    void write(T input) throws WriteFileException;
}
