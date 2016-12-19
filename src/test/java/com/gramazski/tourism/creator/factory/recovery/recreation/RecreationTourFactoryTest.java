package com.gramazski.tourism.creator.factory.recovery.recreation;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.creator.key.EntityName;
import com.gramazski.tourism.creator.storage.FactoriesStorage;
import com.gramazski.tourism.entity.recovery.recreation.RecreationTour;
import com.gramazski.tourism.exception.DataReaderException;
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
    public void getTourWithRightMultiDataReturnCreatedTourList() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<RecreationTour> recreationTours = new ArrayList<RecreationTour>();
        AbstractTourFactory tourFactory;
        ArrayList<ParsingDataStruct> parsingMultiData =
                dataParser.parse(textFileReader.read("src/main/resources/test/factory/right/recreationMulti.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            recreationTours.add((RecreationTour) tourFactory.getTour(parsingData.getParameters()));
        }

        Assert.assertEquals(recreationTours.get(1).getCountry(), Country.FRANCE);
    }

    @Test
    public void getTourWithWrongMultiDataIncorrectToursDelimiterReturnDataReaderException() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<RecreationTour> recreationTours = new ArrayList<RecreationTour>();
        AbstractTourFactory tourFactory;
        try {
            ArrayList<ParsingDataStruct> parsingMultiData =
                    dataParser.parse(textFileReader.read("src/main/resources/test/factory/wrong/multiDataWithWrongSeparator.txt"));

            for (ParsingDataStruct parsingData : parsingMultiData) {
                tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
                recreationTours.add((RecreationTour) tourFactory.getTour(parsingData.getParameters()));
                Assert.fail("Get tour with wrong data - incorrect tours delimiter failed.");
            }
        }
        catch (DataReaderException ex){
            Assert.assertTrue(true);
        }
    }

}