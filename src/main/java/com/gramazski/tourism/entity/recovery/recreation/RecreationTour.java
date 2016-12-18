package com.gramazski.tourism.entity.recovery.recreation;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.recovery.Meal;
import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.attribute.recovery.recreation.Hotel;
import com.gramazski.tourism.attribute.recovery.recreation.RestPlace;
import com.gramazski.tourism.entity.recovery.RecoveryTour;

/**
 * Created by gs on 18.12.2016.
 */
public class RecreationTour extends RecoveryTour {
    private Hotel hotel;
    private RestPlace restPlace;

    public RecreationTour(Country country, Season season, Transport transport, int price,
                          int duration, Place placeOfStay, Meal meal, Hotel hotel, RestPlace restPlace) {
        super(country, season, transport, price, duration, placeOfStay, meal);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public RestPlace getRestPlace() {
        return restPlace;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setRestPlace(RestPlace restPlace) {
        this.restPlace = restPlace;
    }
}
