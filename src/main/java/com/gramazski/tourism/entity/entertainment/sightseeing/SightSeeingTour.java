package com.gramazski.tourism.entity.entertainment.sightseeing;

import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public class SightSeeingTour extends EntertainmentTour {
    private String sight;
    private Place place;

    public Place getPlace() {
        return place;
    }

    public String getSight() {
        return sight;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setSight(String sight) {
        this.sight = sight;
    }
}
