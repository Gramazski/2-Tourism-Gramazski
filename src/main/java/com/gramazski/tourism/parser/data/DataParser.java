package com.gramazski.tourism.parser.data;

import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.exception.DataReaderException;
import com.gramazski.tourism.parser.AbstractParser;

/**
 * Created by gs on 18.12.2016.
 */
public class DataParser extends AbstractParser {
    public ParsingDataStruct parse(String data) throws DataReaderException {
        String[] entityData = data.split(":");

        if (entityData.length != 2){
            throw new DataReaderException("Incorrect data in file. Data: " + data);
        }

        String[] parameters = entityData[1].split(",");

        ParsingDataStruct parsingData = new ParsingDataStruct(entityData[0], parameters);

        return parsingData;
    }
}
