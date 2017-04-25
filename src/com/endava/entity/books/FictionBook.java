package com.endava.entity.books;

import com.endava.abstractclasses.*;

/**
 * Created by lex on 20.03.2017.
 */
public class FictionBook extends GeneralBook {
    String fantasyParameter;

    public FictionBook(String name, int year, String author, float cost, int popularity, int numberOfPages, String fantasyParameter) {
        super(name, year, author, cost, popularity, numberOfPages);
        this.fantasyParameter = fantasyParameter;
    }

    public FictionBook() {
    }

    public String getFantasyParameter() {
        return fantasyParameter;
    }

    public void setFantasyParameter(String fantasyParameter) {
        this.fantasyParameter = fantasyParameter;
    }

    @Override
    public float getCost() {
        float cost = super.getCost();
        if(cost == 0)
            return getInitialCost();
        return cost;
    }
}
