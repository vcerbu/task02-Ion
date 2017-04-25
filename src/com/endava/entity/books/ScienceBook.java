package com.endava.entity.books;

import com.endava.abstractclasses.*;

/**
 * Created by lex on 20.03.2017.
 */
public class ScienceBook extends GeneralBook {
    String scienceParameter;

    public ScienceBook() {
    }

    public ScienceBook(String name, int year, String author, float cost, int popularity, int numberOfPages, String scienceParameter) {
        super(name, year, author, cost, popularity, numberOfPages);
        this.scienceParameter = scienceParameter;
    }

    public String getScienceParameter() {
        return scienceParameter;
    }

    public void setScienceParameter(String scienceParameter) {
        this.scienceParameter = scienceParameter;
    }
}
