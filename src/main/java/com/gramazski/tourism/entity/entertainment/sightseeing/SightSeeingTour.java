package com.gramazski.tourism.entity.entertainment.sightseeing;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.entertainment.TourForm;
import com.gramazski.tourism.attribute.entertainment.TourType;
import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public class SightSeeingTour extends EntertainmentTour {
    private String sight;
    private Place place;

    public SightSeeingTour(Country country, Season season, Transport transport, int price, int duration,
                           TourForm tourForm, TourType tourType, int travelExpenses, String sight, Place place) {
        super(country, season, transport, price, duration, tourForm, tourType, travelExpenses);
        this.place = place;
        this.sight = sight;
    }

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
