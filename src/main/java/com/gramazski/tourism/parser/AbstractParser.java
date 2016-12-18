package com.gramazski.tourism.parser;

import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.exception.DataReaderException;

/**
 * Created by gs on 18.12.2016.
 */

public abstract class AbstractParser {
    public abstract ParsingDataStruct parse(String data) throws DataReaderException;
}
