package com.endava.entity.products;

import com.endava.abstractclasses.Product;
import com.endava.entity.products.Country;
import com.endava.enums.StatusEnum;
import com.endava.interfaces.ProductionProduct;

/**
 * Created by lex on 21.03.2017.
 */
public class Toys extends Product implements ProductionProduct {

    public Toys(float price, Country deliveryCountry, int count, float weight, float deliveryPrice, StatusEnum status) {
        super(price, deliveryCountry, count, weight, deliveryPrice, status);
    }

    @Override
    public void printInfo() {
        System.out.println("Toy:");
        System.out.println(super.toString());
    }

}
