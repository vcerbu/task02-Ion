package com.endava.finalclasses;

import com.endava.abstractclasses.GeneralBook;

/**
 * Created by vcerbu on 3/21/2017.
 */
public final class PureBook extends GeneralBook {

    public PureBook(GeneralBook generalBook) {

        super(generalBook.getName(), generalBook.getYear(), generalBook.getAuthor(), generalBook.getInitialCost(), generalBook.getPopularity(), generalBook.getNumberOfPages());
    }

    @Override
    public float getCost() {
        return getInitialCost();
    }
}
