package com.gramazski.tourism.entity.recovery;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.recovery.Meal;
import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.entity.Tour;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class RecoveryTour extends Tour {
    private Place placeOfStay;
    private Meal meal;

    public RecoveryTour(Country country, Season season, Transport transport, int price, int duration, Place placeOfStay, Meal meal) {
        super(country, season, transport, price, duration);
        this.placeOfStay = placeOfStay;
        this.meal = meal;
    }

    public Meal getMeal() {
        return meal;
    }

    public Place getPlaceOfStay() {
        return placeOfStay;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void setPlaceOfStay(Place placeOfStay) {
        this.placeOfStay = placeOfStay;
    }
}
