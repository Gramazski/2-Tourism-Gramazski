package com.gramazski.tourism.comparator.price;

import com.gramazski.tourism.entity.Tour;

import java.util.Comparator;

/**
 * Created by gs on 18.12.2016.
 */
public class TourPriceComparator implements Comparator<Tour> {
    public int compare(Tour tour1, Tour tour2) {
        return tour1.getPrice() - tour2.getPrice();
    }
}
