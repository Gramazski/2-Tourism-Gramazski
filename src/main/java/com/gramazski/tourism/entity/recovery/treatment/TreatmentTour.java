package com.gramazski.tourism.entity.recovery.treatment;

import com.gramazski.tourism.attribute.recovery.treatment.TreatmentType;
import com.gramazski.tourism.entity.recovery.RecoveryTour;

/**
 * Created by gs on 18.12.2016.
 */
public class TreatmentTour extends RecoveryTour {
    private TreatmentType treatmentType;
    private boolean personalTraining;

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
