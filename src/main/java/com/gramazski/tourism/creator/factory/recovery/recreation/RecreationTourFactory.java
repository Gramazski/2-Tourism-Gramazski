package com.gramazski.tourism.creator.factory.recovery.recreation;

import com.gramazski.tourism.attribute.recovery.recreation.Hotel;
import com.gramazski.tourism.attribute.recovery.recreation.RestPlace;
import com.gramazski.tourism.creator.factory.recovery.AbstractRecoveryTourFactory;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.recovery.recreation.RecreationTour;
import com.gramazski.tourism.exception.CreatingTourException;

/**
 * Created by gs on 18.12.2016.
 */
public class RecreationTourFactory extends AbstractRecoveryTourFactory {
    public Tour getTour(String[] parsingData) throws CreatingTourException {
        RecreationTour recreationTour = new RecreationTour();
        try {
            setRecreationTourParameters(recreationTour, parsingData);
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

        return recreationTour;
    }

    private void setRecreationTourParameters(RecreationTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setHotel(Hotel.valueOf(parameters[7]));
        tour.setRestPlace(RestPlace.valueOf(parameters[8]));
    }
}
