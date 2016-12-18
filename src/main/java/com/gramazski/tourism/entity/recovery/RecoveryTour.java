package com.gramazski.tourism.entity.recovery;

import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.entity.Tour;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class RecoveryTour extends Tour {
    private Place placeOfStay;

    public Place getPlaceOfStay() {
        return placeOfStay;
    }

    public void setPlaceOfStay(Place placeOfStay) {
        this.placeOfStay = placeOfStay;
    }
}
