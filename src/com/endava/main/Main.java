package com.endava.main;

import com.endava.abstractclasses.Product;
import com.endava.entity.books.ClassicBook;
import com.endava.entity.books.FictionBook;
import com.endava.entity.books.HotFix;
import com.endava.entity.books.ScienceBook;
import com.endava.entity.products.*;
import com.endava.enums.StatusEnum;
import com.endava.finalclasses.PureBook;
import com.endava.entity.field.RandomField;
import com.endava.interfaces.ProductionProduct;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Main {

    public static void printProduct(ProductionProduct product, CountrySupport countrySupport) {
        product.printInfo();
        if (product instanceof Product) {
            Product product1 = (Product) product;
            if (countrySupport.check(((Product) product).getDeliveryCountry())) {
                System.out.println("Product is supported in this country");
            } else System.out.println("Product is not supported in this country");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 01: Books");
        FictionBook fictionBook = new FictionBook("The Martian", 2011, "Andy Weir", 100, 0, 369, "Astronomy");
        fictionBook.setPriceCalculation(new HotFix());
        System.out.println(fictionBook.getName());
        System.out.println(fictionBook.getCost());
        System.out.println("---------------------------");

        ScienceBook scienceBook = new ScienceBook("Silent Spring", 1962, "Rachel Carson", 100, 8, 470, "Self-Manual");
        scienceBook.setPriceCalculation(new HotFix());
        System.out.println(scienceBook.getName());
        System.out.println(scienceBook.getCost());
        System.out.println("---------------------------");

        ClassicBook classicBook = new ClassicBook("Jane Eyre", 1847, "Charlotte Bronte", 100, 1, 470, "Novel");
        classicBook.setPriceCalculation(new HotFix());
        System.out.println(classicBook.getName());
        System.out.println(classicBook.getCost());
        System.out.println("---------------------------");

        System.out.println("Pure books: ");
        PureBook pureBook1 = new PureBook(fictionBook);
        PureBook pureBook2 = new PureBook(scienceBook);
        PureBook pureBook3 = new PureBook(classicBook);

        System.out.println(pureBook1.getName());
        System.out.println(pureBook1.getCost());
        System.out.println("---------------------------");

        System.out.println(pureBook2.getName());
        System.out.println(pureBook2.getCost());
        System.out.println("---------------------------");

        System.out.println(pureBook3.getName());
        System.out.println(pureBook3.getCost());
        System.out.println("---------------------------");


        System.out.println("Task 02: Products");
        CountrySupport countrySupport1 = new CountrySupport(new Country[]{new Country("USA", 123)});
        CountrySupport countrySupport2 = new CountrySupport(new Country[]{new Country("France", 234)});
        CountrySupport countrySupport3 = new CountrySupport(new Country[]{new Country("Great Britain", 985)});

        Toys toy1 = new Toys(100, new Country("USA", 123), 2, 100, 50, StatusEnum.New);
        printProduct(toy1, countrySupport1);
        System.out.println("---------------------------");

        Furniture furniture1 = new Furniture(230, new Country("France", 234), 4, 35, 150, StatusEnum.Complete);
        printProduct(furniture1, countrySupport2);
        System.out.println("---------------------------");

        Food food1 = new Food(150, new Country("USA", 1235), 5, 123, 56, StatusEnum.InProgress);
        printProduct(food1, countrySupport1);
        System.out.println("---------------------------");

        System.out.println("Task 03: RandomizedField");
        RandomField randomField = new RandomField();
        randomField.createFillPrintField(4, 4, 16);
    }
}
