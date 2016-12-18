package com.gramazski.tourism.parser.multi;

import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.exception.DataReaderException;
import com.gramazski.tourism.parser.AbstractMultiParser;
import com.gramazski.tourism.parser.AbstractParser;
import com.gramazski.tourism.parser.data.DataParser;

import java.util.ArrayList;

/**
 * Created by gs on 18.12.2016.
 */
public class MultiDataParser extends AbstractMultiParser {
    public ArrayList<ParsingDataStruct> parse(String data) throws DataReaderException {
        String[] multiParsingData = data.split(";");
        AbstractParser parser = new DataParser();
        ArrayList<ParsingDataStruct> parsingDataList = new ArrayList<ParsingDataStruct>(multiParsingData.length);

        for (int i = 0; i < multiParsingData.length; i++){
            parsingDataList.add(parser.parse(multiParsingData[i]));
        }

        return parsingDataList;
    }
}
