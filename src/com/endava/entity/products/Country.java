package com.endava.entity.products;

/**
 * Created by lex on 21.03.2017.
 */
public class Country {
    private String name;
    private float taxFee;

    public Country(String name, float taxFee) {
        this.name = name;
        this.taxFee = taxFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(float taxFee) {
        this.taxFee = taxFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        if (Float.compare(country.getTaxFee(), getTaxFee()) != 0) return false;
        return getName() != null ? getName().equals(country.getName()) : country.getName() == null;

    }
    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getTaxFee() != +0.0f ? Float.floatToIntBits(getTaxFee()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", taxFee=" + taxFee +
                '}';
    }
}
