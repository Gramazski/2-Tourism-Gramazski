package com.gramazski.tourism.creator.factory.entertainment.shopping;

import com.gramazski.tourism.attribute.entertainment.shopping.Product;
import com.gramazski.tourism.creator.factory.entertainment.AbstractEntertainmentTourFactory;
import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.entity.entertainment.shopping.ShoppingTour;
import com.gramazski.tourism.exception.CreatingTourException;

/**
 * Created by gs on 18.12.2016.
 */
public class ShoppingTourFactory extends AbstractEntertainmentTourFactory {
    public Tour getTour(String[] parsingData) throws CreatingTourException {
        ShoppingTour shoppingTour = new ShoppingTour();
        try {
            setShoppingTourParameters(shoppingTour, parsingData);
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

        return shoppingTour;
    }

    private void setShoppingTourParameters(ShoppingTour tour, String[] parameters){
        super.setTourParameters(tour, parameters);
        tour.setAverageSpend(Integer.parseInt(parameters[9]));
        tour.setProduct(Product.valueOf(parameters[10]));
    }
}
