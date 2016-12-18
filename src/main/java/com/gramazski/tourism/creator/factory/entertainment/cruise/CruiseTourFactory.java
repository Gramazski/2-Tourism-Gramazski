package com.gramazski.tourism.creator.factory.entertainment.cruise;

import com.gramazski.tourism.attribute.entertainment.cruise.Apartments;
import com.gramazski.tourism.attribute.entertainment.cruise.Ship;
import com.gramazski.tourism.creator.factory.entertainment.AbstractEntertainmentTourFactory;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.entertainment.cruise.CruiseTour;
import com.gramazski.tourism.exception.CreatingTourException;


public class CruiseTourFactory extends AbstractEntertainmentTourFactory {
    public Tour getTour(String[] parsingData) throws CreatingTourException {
        CruiseTour cruiseTour = new CruiseTour();
        try {
            setTourParameters(cruiseTour, parsingData);
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

        return cruiseTour;
    }

    private void setTourParameters(CruiseTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setShip(Ship.valueOf(parameters[8]));
        tour.setApartments(Apartments.valueOf(parameters[9]));
    }
}
