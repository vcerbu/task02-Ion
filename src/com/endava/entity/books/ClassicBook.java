package com.endava.entity.books;

import com.endava.abstractclasses.GeneralBook;

/**
 * Created by lex on 20.03.2017.
 */
public class ClassicBook extends GeneralBook {
    String classicParameter;

    public ClassicBook() {
    }

    public ClassicBook(String name, int year, String author, float cost, int popularity, int numberOfPages, String classicParameter) {
        super(name, year, author, cost, popularity, numberOfPages);
        this.classicParameter = classicParameter;
    }

    public String getClassicParameter() {
        return classicParameter;
    }

    public void setClassicParameter(String classicParameter) {
        this.classicParameter = classicParameter;
    }
}
