package com.gramazski.tourism.reader;

import com.gramazski.tourism.exception.DataReaderException;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractReader {
    public abstract String read(String fileName) throws DataReaderException;
}
