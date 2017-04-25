package com.endava.entity.products;

import com.endava.entity.products.Country;

/**
 * Created by lex on 21.03.2017.
 */
public class CountrySupport {
    Country[] supportedClasses;

    public CountrySupport(Country[] supportedClasses) {
        this.supportedClasses = supportedClasses;
    }

    public Country[] getSupportedClasses() {
        return supportedClasses;
    }

    public void setSupportedClasses(Country[] supportedClasses) {
        supportedClasses = supportedClasses;
    }

    public boolean check(Country country) {
        for (Country country1 : supportedClasses)
            if (country.equals(country1))
                return true;
        return false;
    }
}
