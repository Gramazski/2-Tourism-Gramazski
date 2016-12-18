package com.gramazski.tourism.entity.recovery.treatment;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.recovery.Meal;
import com.gramazski.tourism.attribute.recovery.Place;
import com.gramazski.tourism.attribute.recovery.treatment.TreatmentType;
import com.gramazski.tourism.entity.recovery.RecoveryTour;

/**
 * Created by gs on 18.12.2016.
 */
public class TreatmentTour extends RecoveryTour {
    private TreatmentType treatmentType;
    private boolean personalTraining;

    public TreatmentTour(Country country, Season season, Transport transport, int price, int duration,
                         Place placeOfStay, Meal meal, TreatmentType treatmentType, boolean personalTraining) {
        super(country, season, transport, price, duration, placeOfStay, meal);
        this.treatmentType = treatmentType;
        this.personalTraining = personalTraining;
    }

    public boolean isPersonalTraining() {
        return personalTraining;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setPersonalTraining(boolean personalTraining) {
        this.personalTraining = personalTraining;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }
}
