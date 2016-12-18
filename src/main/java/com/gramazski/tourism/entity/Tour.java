package com.gramazski.tourism.entity;

import com.gramazski.tourism.attribute.base.Country;
import com.gramazski.tourism.attribute.base.Season;
import com.gramazski.tourism.attribute.base.Transport;
import com.gramazski.tourism.attribute.recovery.Meal;

/**
 * Created by gs on 18.12.2016.
 */
public abstract class Tour {
    private Country country;
    private Season season;
    private Transport transport;
    private int price;
    private int duration;
    private Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Country getCountry() {
        return country;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public Season getSeason() {
        return season;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
