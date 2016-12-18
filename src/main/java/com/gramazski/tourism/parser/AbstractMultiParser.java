package com.gramazski.tourism.parser;

import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.exception.DataReaderException;

import java.util.ArrayList;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractMultiParser {
    public abstract ArrayList<ParsingDataStruct> parse(String data) throws DataReaderException;
}
