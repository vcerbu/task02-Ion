package com.endava.entity.books;

import java.util.Date;
import java.util.Random;

/**
 * Created by vcerbu on 3/22/2017.
 */
public class HotFix extends DefaultPriceCalculation {
    private static final Random randomizer = new Random();

    static {
        randomizer.setSeed(new Date().hashCode());
    }
    @Override
    public float calculatePrice(float cost) {
        if(getDependencyFactor() >= 8)
            cost *= (1.1 + (getDependencyFactor() - 8) * 0.1);
        else if(getDependencyFactor() < 1) {
            int value = randomizer.nextInt(2);
            if(value == 0)
                return 0;
        }
        return cost;
    }

}
