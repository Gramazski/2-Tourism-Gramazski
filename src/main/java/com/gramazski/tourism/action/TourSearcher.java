package com.gramazski.tourism.action;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Meal;
import com.gramazski.tourism.entity.Tour;

import java.util.ArrayList;

/**
 * Created by gs on 19.12.2016.
 */
public class TourSearcher {
    public ArrayList<Tour> findTourByCountry(ArrayList<Tour> tours, Country country){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if (tour.getCountry().equals(country)){
                searchedTours.add(tour);
            }
        }

        return searchedTours;
    }

    public ArrayList<Tour> findTourByDurationWithinLimits(ArrayList<Tour> tours, int leftLimit, int rightLimit){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if ((tour.getDuration() > leftLimit) && (tour.getDuration() < rightLimit)){
                searchedTours.add(tour);
            }
        }

        return searchedTours;
    }

    public ArrayList<Tour> findTourByMeal(ArrayList<Tour> tours, Meal meal){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if (tour.getMeal().equals(meal)){
                searchedTours.add(tour);
            }
        }

        return searchedTours;
    }
}
