package com.gramazski.tourism.creator.factory;

import com.gramazski.tourism.entity.Tour;
import com.gramazski.tourism.exception.CreatingTourException;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractTourFactory {
    public abstract Tour getTour(String[] parsingData) throws CreatingTourException;
}
