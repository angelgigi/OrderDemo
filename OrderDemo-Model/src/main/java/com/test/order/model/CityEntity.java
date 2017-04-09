package com.test.order.model;

/**
 * Created by lukuanpc on 2016/12/25.
 */
public class CityEntity implements java.io.Serializable {
    private int id;
    private String name;
    private String countryCode;
    private String district;

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    private String population;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String currencyCode) {
        this.countryCode = currencyCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
