package com.endava.abstractclasses;

import com.endava.entity.books.DefaultPriceCalculation;
import com.endava.interfaces.PriceCalculation;

/**
 * Created by lex on 20.03.2017.
 */
public abstract class GeneralBook {
    private String name;
    private int year;
    private String author;
    private float cost;
    private int popularity;
    private int numberOfPages;
    private float initialCost;
    private PriceCalculation priceCalculation;

    public GeneralBook() {
        priceCalculation = new DefaultPriceCalculation();
    }

    public GeneralBook(String name, int year, String author, float cost, int popularity, int numberOfPages) {
        this();
        this.name = name;
        this.year = year;
        this.author = author;
        this.cost = cost;
        this.popularity = popularity;
        //validatePopularityScore(popularity);
        this.numberOfPages = numberOfPages;
        this.initialCost = cost;
        priceCalculation.setDependencyFactor(popularity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getCost() {
        return priceCalculation.calculatePrice(cost);
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        validatePopularityScore(this.popularity);
        priceCalculation.setDependencyFactor(popularity);
        // this.popularity=popularity;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public PriceCalculation getPriceCalculation() {
        return priceCalculation;
    }

    public void setPriceCalculation(PriceCalculation priceCalculation) {
        this.priceCalculation = priceCalculation;
        priceCalculation.setDependencyFactor(popularity);
    }

    public int validatePopularityScore(int popularity) {
        if ((this.popularity >= 1) || (this.popularity <= 10)) {
            return popularity;
        }
        return 0;
    }

    public float getInitialCost() {
        return initialCost;
    }




}
