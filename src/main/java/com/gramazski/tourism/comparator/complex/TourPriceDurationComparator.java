package com.gramazski.tourism.comparator.complex;

import com.gramazski.tourism.comparator.duration.TourDurationComparator;
import com.gramazski.tourism.comparator.price.TourPriceComparator;
import com.gramazski.tourism.entity.Tour;

import java.util.Comparator;

/**
 * Created by gs on 18.12.2016.
 */
public class TourPriceDurationComparator implements Comparator<Tour> {

    public int compare(Tour tour1, Tour tour2) {
        Comparator<Tour> priceComparator = new TourPriceComparator();
        Comparator<Tour> durationComparator = new TourDurationComparator();
        int result = priceComparator.compare(tour1, tour2);

        if (result == 0){
            result = durationComparator.compare(tour1, tour2);
        }

        return result;
    }
}
