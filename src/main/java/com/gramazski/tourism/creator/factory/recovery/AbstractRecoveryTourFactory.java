package com.gramazski.tourism.creator.factory.recovery;

import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.entity.recovery.RecoveryTour;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractRecoveryTourFactory extends AbstractTourFactory {
    protected void setTourParameters(RecoveryTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setPlaceOfStay(Place.valueOf(parameters[6]));
    }
}
