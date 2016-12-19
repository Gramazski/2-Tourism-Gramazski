package com.gramazski.tourism.creator.factory.entertainment.cruise;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.exception.CreatingTourException;
import com.gramazski.tourism.parser.data.DataParser;
import com.gramazski.tourism.reader.file.TextFileReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 18.12.2016.
 */
public class CruiseTourFactoryTest {
    @Test
    public void getTourWithRightDataInFileReturnCreatedTour() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        DataParser dataParser = new DataParser();
        ParsingDataStruct parsingData = dataParser.parse(textFileReader.read("src/main/resources/test/factory/right/cruise.txt"));
        CruiseTourFactory cruiseTourFactory = new CruiseTourFactory();

        Tour cruiseTour = cruiseTourFactory.getTour(parsingData.getParameters());

        Assert.assertEquals(cruiseTour.getCountry(), Country.FRANCE);
    }

    @Test
    public void getTourWithWrongDataInFileNotEnoughParametersReturnException() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        DataParser dataParser = new DataParser();
        ParsingDataStruct parsingData =
                dataParser.parse(textFileReader.read("src/main/resources/test/factory/wrong/cruiseNotEnoughParameters.txt"));
        CruiseTourFactory cruiseTourFactory = new CruiseTourFactory();

        try {
            Tour cruiseTour = cruiseTourFactory.getTour(parsingData.getParameters());
            Assert.fail("Get tour with wrong data - not enough parameters failed.");
        }
        catch (CreatingTourException ex){
            Assert.assertTrue(true);
        }
    }

}