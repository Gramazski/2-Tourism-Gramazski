package com.gramazski.tourism.entity.recovery.recreation;

import com.gramazski.tourism.attribute.recovery.recreation.Hotel;
import com.gramazski.tourism.attribute.recovery.recreation.RestPlace;
import com.gramazski.tourism.entity.recovery.RecoveryTour;

/**
 * Created by gs on 18.12.2016.
 */
public class RecreationTour extends RecoveryTour {
    private Hotel hotel;
    private RestPlace restPlace;

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
