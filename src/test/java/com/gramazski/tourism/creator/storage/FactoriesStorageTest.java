package com.gramazski.tourism.creator.storage;

import com.gramazski.tourism.creator.factory.AbstractTourFactory;
import com.gramazski.tourism.creator.factory.entertainment.cruise.CruiseTourFactory;
import com.gramazski.tourism.creator.key.EntityName;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 19.12.2016.
 */
public class FactoriesStorageTest {
    @Test
    public void getFactoryWhenEntityNameIsWrongReturnIllegalArgumentException() throws Exception {
        try {
            AbstractTourFactory tourFactory = FactoriesStorage.getInstance().getFactory(EntityName.valueOf("WRONG"));
            Assert.fail("Get factory with wrong entity name test failed.");
        }
        catch (IllegalArgumentException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void addFactoryWhenEntityNameIsPresentYetReturnFalse() throws Exception {
        boolean actual = FactoriesStorage.getInstance().addFactory(EntityName.CRUISE, new CruiseTourFactory());

        Assert.assertFalse(actual);
    }

    @Test
    public void addFactoryWhenEntityNameIsNotPresentYetReturnTrue() throws Exception {
        boolean actual = FactoriesStorage.getInstance().addFactory(EntityName.FORTEST, new CruiseTourFactory());

        Assert.assertTrue(actual);
        Assert.assertEquals(CruiseTourFactory.class, FactoriesStorage.getInstance().getFactory(EntityName.FORTEST).getClass());
    }

}