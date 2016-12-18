package com.gramazski.tourism.creator.factory.entertainment.sightseeing;

import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.creator.factory.entertainment.AbstractEntertainmentTourFactory;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.entertainment.sightseeing.SightSeeingTour;
import com.gramazski.tourism.exception.CreatingTourException;

/**
 * Created by gs on 18.12.2016.
 */
public class SightSeeingTourFactory extends AbstractEntertainmentTourFactory {
    public Tour getTour(String[] parsingData) throws CreatingTourException {
        SightSeeingTour sightSeeingTour = new SightSeeingTour();
        try {
            setSightSeeingTourParameters(sightSeeingTour, parsingData);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            throw new CreatingTourException("Cruise tour creating failed. Course: invalid parameters count - " + parsingData.length +
                    ". Needed - 10");
        }
        catch (NumberFormatException ex){
            throw new CreatingTourException("Cruise tour creating failed. Converting data failed. Course: " + ex.getMessage());
        }
        catch (IllegalArgumentException ex){
            throw new CreatingTourException("Cruise tour creating failed. Converting data failed. Course: " + ex.getMessage());
        }

        return sightSeeingTour;
    }

    private void setSightSeeingTourParameters(SightSeeingTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setSight(parameters[9]);
        tour.setPlace(Place.valueOf(parameters[10]));
    }
}
