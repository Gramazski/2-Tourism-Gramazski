package com.gramazski.tourism.creator.factory.recovery.treatment;

import com.gramazski.tourism.attribute.recovery.treatment.TreatmentType;
import com.gramazski.tourism.creator.factory.recovery.AbstractRecoveryTourFactory;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.recovery.treatment.TreatmentTour;
import com.gramazski.tourism.exception.CreatingTourException;

/**
 * Created by gs on 18.12.2016.
 */
public class TreatmentTourFactory extends AbstractRecoveryTourFactory {
    public Tour getTour(String[] parsingData) throws CreatingTourException {
        TreatmentTour treatmentTour = new TreatmentTour();
        try {
            setTreatmentTourParameters(treatmentTour, parsingData);
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

        return treatmentTour;
    }

    private void setTreatmentTourParameters(TreatmentTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setTreatmentType(TreatmentType.valueOf(parameters[7]));
        tour.setPersonalTraining(Boolean.parseBoolean(parameters[8]));
    }
}
