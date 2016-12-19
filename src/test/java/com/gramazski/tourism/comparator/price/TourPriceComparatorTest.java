package com.gramazski.tourism.comparator.price;

import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.creator.key.EntityName;
import com.gramazski.tourism.creator.storage.FactoriesStorage;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.parser.multi.MultiDataParser;
import com.gramazski.tourism.reader.file.TextFileReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by gs on 19.12.2016.
 */
public class TourPriceComparatorTest {
    @Test
    public void sortTourListUsingComparatorByPrice() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<Tour> actualTours = new ArrayList<Tour>();
        AbstractTourFactory tourFactory;
        ArrayList<ParsingDataStruct> parsingMultiData =
                dataParser.parse(textFileReader.read("src/main/resources/test/comparator/tourList.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            actualTours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        Collections.sort(actualTours, new TourPriceComparator());

        ArrayList<Tour> expectedTours = new ArrayList<Tour>();

        parsingMultiData = dataParser.parse(textFileReader.read("src/main/resources/test/comparator/sortedByPriceTourList.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            expectedTours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        for (int i = 0; i < actualTours.size(); i++){
            Assert.assertEquals(actualTours.get(i).getPrice(), expectedTours.get(i).getPrice());
        }
    }

}