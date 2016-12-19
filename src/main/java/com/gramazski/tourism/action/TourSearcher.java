package com.gramazski.tourism.action;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Meal;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.entity.Tour;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by gs on 19.12.2016.
 */
public class TourSearcher {
    final static Logger logger = LogManager.getLogger(TourSearcher.class);

    public ArrayList<Tour> findTourByCountry(ArrayList<Tour> tours, Country country){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if (tour.getCountry().equals(country)){
                searchedTours.add(tour);
            }
        }

        logger.log(Level.INFO, "Tours found. Count: " + searchedTours.size() + ". By country: " + country);

        return searchedTours;
    }

    public ArrayList<Tour> findTourByDurationWithinLimits(ArrayList<Tour> tours, int leftLimit, int rightLimit){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if ((tour.getDuration() > leftLimit) && (tour.getDuration() < rightLimit)){
                searchedTours.add(tour);
            }
        }

        logger.log(Level.INFO, "Tours found. Count: " + searchedTours.size() + ". By limits: " + leftLimit + " - " + rightLimit + ".");

        return searchedTours;
    }

    public ArrayList<Tour> findTourByMeal(ArrayList<Tour> tours, Meal meal){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if (tour.getMeal().equals(meal)){
                searchedTours.add(tour);
            }
        }

        logger.log(Level.INFO, "Tours found. Count: " + searchedTours.size() + ". By meal: " + meal);

        return searchedTours;
    }

    public ArrayList<Tour> findTourByTransport(ArrayList<Tour> tours, Transport transport){
        ArrayList<Tour> searchedTours = new ArrayList<Tour>();

        for (Tour tour : tours) {
            if (tour.getTransport().equals(transport)){
                searchedTours.add(tour);
            }
        }

        logger.log(Level.INFO, "Tours found. Count: " + searchedTours.size() + ". By transport: " + transport);

        return searchedTours;
    }
}
