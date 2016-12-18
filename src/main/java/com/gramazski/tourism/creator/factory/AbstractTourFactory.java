package com.gramazski.tourism.creator.factory;

import com.gramazski.tourism.creator.data.ParsingDataStruct;
import com.gramazski.tourism.entity.Tour;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class AbstractTourFactory {
    public abstract Tour getTour(ParsingDataStruct parsingData);
}
