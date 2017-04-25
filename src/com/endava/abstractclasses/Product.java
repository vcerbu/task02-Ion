package com.endava.abstractclasses;

import com.endava.entity.products.Country;
import com.endava.enums.StatusEnum;

/**
 * Created by lex on 21.03.2017.
 */
public abstract class Product {
    float price;
    Country deliveryCountry;
    int count;
    float weight;
    float deliveryPrice;
    StatusEnum status;

    public Product() {
    }

    public Product(float price, Country deliveryCountry, int count, float weight, float deliveryPrice, StatusEnum status) {
        this.price = price;
        this.deliveryCountry = deliveryCountry;
        this.count = count;
        this.weight = weight;
        this.deliveryPrice = deliveryPrice;
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Country getDeliveryCountry() {
        return deliveryCountry;
    }

    public void setDeliveryCountry(Country deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(float deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", deliveryCountry='" + deliveryCountry + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                ", deliveryPrice=" + deliveryPrice +
                ", status=" + status +
                '}';
    }
}
