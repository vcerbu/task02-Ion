package com.endava.entity.books;

import com.endava.interfaces.PriceCalculation;

/**
 * Created by vcerbu on 3/22/2017.
 */
public class DefaultPriceCalculation implements PriceCalculation {
    private int dependencyFactor;

    @Override
    public float calculatePrice(float cost) {
        if (dependencyFactor > 9)
            cost *= 1.2;
        else if (dependencyFactor < 4)
            cost *= 0.1;
        return cost;
    }

    public int getDependencyFactor() {
        return dependencyFactor;
    }

    @Override
    public void setDependencyFactor(int dependencyFactor) {
        this.dependencyFactor = dependencyFactor;
    }
}
