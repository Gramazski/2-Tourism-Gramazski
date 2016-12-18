package com.gramazski.tourism.comparator.duration;

import com.gramazski.tourism.entity.Tour;

import java.util.Comparator;

/**
 * Created by gs on 18.12.2016.
 */
public class TourDurationComparator implements Comparator<Tour> {
    public int compare(Tour tour1, Tour tour2) {
        return tour1.getDuration() - tour2.getDuration();
    }
}
