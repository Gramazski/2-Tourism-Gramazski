package com.gramazski.tourism.creator.factory.entertainment.cruise;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.parser.data.DataParser;
import com.gramazski.tourism.reader.file.TextFileReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 18.12.2016.
 */
public class CruiseTourFactoryTest {
    @Test
    public void getTourWithRightDataInFileReturnTrue() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        DataParser dataParser = new DataParser();
        ParsingDataStruct parsingData = dataParser.parse(textFileReader.read("src/main/resources/test/cruise.txt"));
        CruiseTourFactory cruiseTourFactory = new CruiseTourFactory();

        Tour cruiseTour = cruiseTourFactory.getTour(parsingData.getParameters());

        Assert.assertEquals(cruiseTour.getCountry(), Country.FRANCE);
    }

}