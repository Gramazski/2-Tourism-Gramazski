package com.gramazski.tourism.entity.entertainment;

import com.gramazski.tourism.attribute.entertainment.TourForm;
import com.gramazski.tourism.attribute.entertainment.TourType;
import com.gramazski.tourism.entity.Tour;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class EntertainmentTour extends Tour {
    private int travelExpenses;
    private TourForm tourForm;
    private TourType tourType;

    public int getTravelExpenses() {
        return travelExpenses;
    }

    public TourForm getTourForm() {
        return tourForm;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourForm(TourForm tourForm) {
        this.tourForm = tourForm;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public void setTravelExpenses(int travelExpenses) {
        this.travelExpenses = travelExpenses;
    }
}
