package com.gramazski.tourism.entity.entertainment.cruise;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.entertainment.TourForm;
import com.gramazski.tourism.attribute.entertainment.TourType;
import com.gramazski.tourism.attribute.entertainment.cruise.Apartments;
import com.gramazski.tourism.attribute.entertainment.cruise.Ship;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public class CruiseTour extends EntertainmentTour {
    private Ship ship;
    private Apartments apartments;

    public CruiseTour(Country country, Season season, Transport transport, int price, int duration,
                      TourForm tourForm, TourType tourType, int travelExpenses, Ship ship, Apartments apartments) {
        super(country, season, transport, price, duration, tourForm, tourType, travelExpenses);
        this.ship = ship;
        this.apartments = apartments;
    }

    public Apartments getApartments() {
        return apartments;
    }

    public Ship getShip() {
        return ship;
    }

    public void setApartments(Apartments apartments) {
        this.apartments = apartments;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
