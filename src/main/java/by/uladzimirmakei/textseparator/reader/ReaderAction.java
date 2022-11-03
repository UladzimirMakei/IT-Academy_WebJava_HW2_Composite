package by.uladzimirmakei.textseparator.reader;


import by.uladzimirmakei.textseparator.exception.TextReaderException;

public interface ReaderAction<T> {
    T read() throws TextReaderException;
}
