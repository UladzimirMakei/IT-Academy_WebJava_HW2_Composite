package by.uladzimirmakei.textseparator.service.reader;


import by.uladzimirmakei.textseparator.repository.exception.TextReaderException;

public interface ReaderAction<T> {
    T read() throws TextReaderException;
}
