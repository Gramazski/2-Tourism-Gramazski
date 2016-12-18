package com.gramazski.tourism.entity.entertainment.shopping;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.entertainment.TourForm;
import com.gramazski.tourism.attribute.entertainment.TourType;
import com.gramazski.tourism.attribute.entertainment.shopping.Product;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public class ShoppingTour extends EntertainmentTour {
    private int averageSpend;
    private Product product;

    public ShoppingTour(Country country, Season season, Transport transport, int price, int duration, TourForm tourForm,
                        TourType tourType, int travelExpenses, int averageSpend, Product product) {
        super(country, season, transport, price, duration, tourForm, tourType, travelExpenses);
        this.averageSpend = averageSpend;
        this.product = product;
    }

    public int getAverageSpend() {
        return averageSpend;
    }

    public Product getProduct() {
        return product;
    }

    public void setAverageSpend(int averageSpend) {
        this.averageSpend = averageSpend;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
