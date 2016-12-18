package com.gramazski.tourism.comparator.complex;

import com.gramazski.tourism.comparator.country.TourCountryComparator;
import com.gramazski.tourism.entity.Tour;

import java.util.Comparator;

/**
 * Created by gs on 18.12.2016.
 */
public class TourPriceDurationCountryComparator implements Comparator<Tour> {
    public int compare(Tour tour1, Tour tour2) {
        Comparator<Tour> priceDurationComparator = new TourPriceDurationComparator();
        Comparator<Tour> countryComparator = new TourCountryComparator();
        int result = priceDurationComparator.compare(tour1, tour2);

        if (result == 0){
            result = countryComparator.compare(tour1, tour2);
        }

        return result;
    }
}
