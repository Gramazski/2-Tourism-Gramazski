package com.gramazski.tourism.comparator.country;

import com.gramazski.tourism.entity.Tour;

import java.util.Comparator;

/**
 * Created by gs on 18.12.2016.
 */
public class TourCountryComparator implements Comparator<Tour> {
    public int compare(Tour tour1, Tour tour2) {
        return tour1.getCountry().compareTo(tour2.getCountry());
    }
}
