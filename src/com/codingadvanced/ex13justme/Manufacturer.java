package com.codingadvanced.ex13justme;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Manufacturer setName(String name) {
        this.name = name;
        return this;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public Manufacturer setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Manufacturer setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && name.equals(that.name) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                "country='" + country + '\'' +
                '}';
    }
}
