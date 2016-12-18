package com.gramazski.tourism.creator.factory.entertainment;

import com.gramazski.tourism.attribute.entertainment.TourForm;
import com.gramazski.tourism.attribute.entertainment.TourType;
import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractEntertainmentTourFactory extends AbstractTourFactory {

    protected void setTourParameters(EntertainmentTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setTravelExpenses(Integer.parseInt(parameters[5]));
        tour.setTourForm(TourForm.valueOf(parameters[6]));
        tour.setTourType(TourType.valueOf(parameters[7]));
    }
}
