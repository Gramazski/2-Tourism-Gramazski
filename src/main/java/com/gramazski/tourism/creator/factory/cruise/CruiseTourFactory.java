package com.gramazski.tourism.creator.factory.cruise;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.entertainment.TourForm;
import com.gramazski.tourism.attribute.entertainment.TourType;
import com.gramazski.tourism.attribute.entertainment.cruise.Apartments;
import com.gramazski.tourism.attribute.entertainment.cruise.Ship;
import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.entertainment.cruise.CruiseTour;
import com.gramazski.tourism.exception.CreatingTourException;


public class CruiseTourFactory extends AbstractTourFactory {
    public Tour getTour(String[] parsingData) throws CreatingTourException {
        CruiseTour cruiseTour = new CruiseTour();
        try {
            cruiseTour.setCountry(Country.valueOf(parsingData[0]));
            cruiseTour.setSeason(Season.valueOf(parsingData[1]));
            cruiseTour.setTransport(Transport.valueOf(parsingData[2]));
            cruiseTour.setPrice(Integer.parseInt(parsingData[3]));
            cruiseTour.setDuration(Integer.parseInt(parsingData[4]));
            cruiseTour.setTravelExpenses(Integer.parseInt(parsingData[5]));
            cruiseTour.setTourForm(TourForm.valueOf(parsingData[6]));
            cruiseTour.setTourType(TourType.valueOf(parsingData[7]));
            cruiseTour.setShip(Ship.valueOf(parsingData[8]));
            cruiseTour.setApartments(Apartments.valueOf(parsingData[9]));
        }
        catch (ArrayIndexOutOfBoundsException ex){
            throw new CreatingTourException("Cruise tour creating failed. Course: invalid parameters count - " + parsingData.length +
            ". Needed - 10");
        }
        catch (NumberFormatException ex){
            throw new CreatingTourException("Cruise tour creating failed. Converting data failed. Course: " + ex.getMessage());
        }

        return cruiseTour;
    }
}
