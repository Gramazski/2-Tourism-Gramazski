package com.gramazski.tourism.entity.entertainment.cruise;

import com.gramazski.tourism.attribute.entertainment.cruise.Apartments;
import com.gramazski.tourism.attribute.entertainment.cruise.Ship;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public class CruiseTour extends EntertainmentTour {
    private Ship ship;
    private Apartments apartments;

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
