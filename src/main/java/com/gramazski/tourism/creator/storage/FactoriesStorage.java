package com.gramazski.tourism.creator.storage;

import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.creator.factory.entertainment.cruise.CruiseTourFactory;
import com.gramazski.tourism.creator.factory.entertainment.shopping.ShoppingTourFactory;
import com.gramazski.tourism.creator.factory.entertainment.sightseeing.SightSeeingTourFactory;
import com.gramazski.tourism.creator.factory.recovery.recreation.RecreationTourFactory;
import com.gramazski.tourism.creator.factory.recovery.treatment.TreatmentTourFactory;
import com.gramazski.tourism.creator.key.EntityName;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gs on 18.12.2016.
 */

public class FactoriesStorage {
    private Map<EntityName, AbstractTourFactory> factoryMap;

    private FactoriesStorage(){
        factoryMap = new HashMap<EntityName, AbstractTourFactory>();
        factoryMap.put(EntityName.CRUISE, new CruiseTourFactory());
        factoryMap.put(EntityName.SHOPPING, new ShoppingTourFactory());
        factoryMap.put(EntityName.SIGHTSEEING, new SightSeeingTourFactory());
        factoryMap.put(EntityName.RECREATION, new RecreationTourFactory());
        factoryMap.put(EntityName.TREATMENT, new TreatmentTourFactory());
    }

    private static class SingletonHelper{
        private static final FactoriesStorage INSTANCE = new FactoriesStorage();
    }

    public static FactoriesStorage getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public AbstractTourFactory getFactory(EntityName entityName){
        if (factoryMap.containsKey(entityName)){
            return factoryMap.get(entityName);
        }
        else {
            return null;
        }
    }

    public boolean addFactory(EntityName entityName, AbstractTourFactory tourFactory){
        if (!(factoryMap.containsKey(entityName)) && !(Modifier.isAbstract(tourFactory.getClass().getModifiers()))){
            factoryMap.put(entityName, tourFactory);
            return true;
        }

        return false;
    }
}
