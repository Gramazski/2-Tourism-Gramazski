package com.gramazski.tourism.entity.entertainment.shopping;

import com.gramazski.tourism.attribute.entertainment.shopping.Product;
import com.gramazski.tourism.entity.entertainment.EntertainmentTour;

/**
 * Created by gs on 18.12.2016.
 */
public class ShoppingTour extends EntertainmentTour {
    private int averageSpend;
    private Product product;

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
