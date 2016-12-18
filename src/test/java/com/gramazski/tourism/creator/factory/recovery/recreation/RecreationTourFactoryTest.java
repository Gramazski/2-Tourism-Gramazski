package com.gramazski.tourism.creator.factory.recovery.recreation;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.recovery.recreation.RecreationTour;
import com.gramazski.tourism.parser.data.DataParser;
import com.gramazski.tourism.parser.multi.MultiDataParser;
import com.gramazski.tourism.reader.file.TextFileReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by gs on 18.12.2016.
 */
public class RecreationTourFactoryTest {
    @Test
    public void getTourWithRightMultiDataReturnTrue() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<RecreationTour> recreationTours = new ArrayList<RecreationTour>();
        ArrayList<ParsingDataStruct> parsingMultiData = dataParser.parse(textFileReader.read("src/main/resources/test/cruise.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {

        }

        Tour cruiseTour = cruiseTourFactory.getTour(parsingData.getParameters());

        Assert.assertEquals(cruiseTour.getCountry(), Country.FRANCE);
    }

}