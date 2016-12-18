package com.gramazski.tourism.creator.factory;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.recovery.Meal;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.exception.CreatingTourException;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractTourFactory {
    public abstract Tour getTour(String[] parsingData) throws CreatingTourException;

    protected void setTourParameters(Tour tour, String[] parameters){
        tour.setCountry(Country.valueOf(parameters[0]));
        tour.setSeason(Season.valueOf(parameters[1]));
        tour.setTransport(Transport.valueOf(parameters[2]));
        tour.setPrice(Integer.parseInt(parameters[3]));
        tour.setDuration(Integer.parseInt(parameters[4]));
        tour.setMeal(Meal.valueOf(parameters[5]));
    }
}
