package com.endava.interfaces;

/**
 * Created by vcerbu on 3/22/2017.
 */
public interface PriceCalculation {
    float calculatePrice(float cost);
    void setDependencyFactor(int factor);
}
