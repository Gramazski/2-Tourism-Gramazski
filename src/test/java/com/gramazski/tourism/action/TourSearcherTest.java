package com.gramazski.tourism.action;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Meal;
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

/**
 * Created by gs on 19.12.2016.
 */
public class TourSearcherTest {
    @Test
    public void findTourByCountryEgypt() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<Tour> tours = new ArrayList<Tour>();
        AbstractTourFactory tourFactory;
        ArrayList<ParsingDataStruct> parsingMultiData =
                dataParser.parse(textFileReader.read("src/main/resources/test/action/tourList.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            tours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        TourSearcher tourSearcher = new TourSearcher();
        ArrayList<Tour> actualTours = tourSearcher.findTourByCountry(tours, Country.EGYPT);

        ArrayList<Tour> expectedTours = new ArrayList<Tour>();

        parsingMultiData = dataParser.parse(textFileReader.read("src/main/resources/test/action/tourListForEgypt.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            expectedTours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        for (int i = 0; i < actualTours.size(); i++){
            Assert.assertEquals(actualTours.get(i).getCountry(), expectedTours.get(i).getCountry());
            Assert.assertEquals(actualTours.get(i).getPrice(), expectedTours.get(i).getPrice());
        }

        Assert.assertEquals(actualTours.size(), expectedTours.size());
    }

    @Test
    public void findTourByDurationWithinLimits4_11() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<Tour> tours = new ArrayList<Tour>();
        AbstractTourFactory tourFactory;
        ArrayList<ParsingDataStruct> parsingMultiData =
                dataParser.parse(textFileReader.read("src/main/resources/test/action/tourList.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            tours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        TourSearcher tourSearcher = new TourSearcher();
        ArrayList<Tour> actualTours = tourSearcher.findTourByDurationWithinLimits(tours, 4, 11);

        ArrayList<Tour> expectedTours = new ArrayList<Tour>();

        parsingMultiData = dataParser.parse(textFileReader.read("src/main/resources/test/action/tourListForDuration4_11.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            expectedTours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        for (int i = 0; i < actualTours.size(); i++){
            Assert.assertEquals(actualTours.get(i).getDuration(), expectedTours.get(i).getDuration());
            Assert.assertEquals(actualTours.get(i).getPrice(), expectedTours.get(i).getPrice());
        }

        Assert.assertEquals(actualTours.size(), expectedTours.size());
    }

    @Test
    public void findTourByMealTriple() throws Exception {
        TextFileReader textFileReader = new TextFileReader();
        MultiDataParser dataParser = new MultiDataParser();
        ArrayList<Tour> tours = new ArrayList<Tour>();
        AbstractTourFactory tourFactory;
        ArrayList<ParsingDataStruct> parsingMultiData =
                dataParser.parse(textFileReader.read("src/main/resources/test/action/tourList.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            tours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        TourSearcher tourSearcher = new TourSearcher();
        ArrayList<Tour> actualTours = tourSearcher.findTourByMeal(tours, Meal.TRIPLE);

        ArrayList<Tour> expectedTours = new ArrayList<Tour>();

        parsingMultiData = dataParser.parse(textFileReader.read("src/main/resources/test/action/tourListForMealTriple.txt"));

        for (ParsingDataStruct parsingData : parsingMultiData) {
            tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf(parsingData.getEntityName()));
            expectedTours.add(tourFactory.getTour(parsingData.getParameters()));
        }

        for (int i = 0; i < actualTours.size(); i++){
            Assert.assertEquals(actualTours.get(i).getMeal(), expectedTours.get(i).getMeal());
            Assert.assertEquals(actualTours.get(i).getPrice(), expectedTours.get(i).getPrice());
        }

        Assert.assertEquals(actualTours.size(), expectedTours.size());
    }

}