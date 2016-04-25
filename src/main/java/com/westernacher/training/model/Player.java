package com.westernacher.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

    enum Position { STRIKER, MIDFIELD, DEFENSE, GOALKEEPER }

    @Id
    private long id;

    private String name;
    private float marketValue;
    private Position position;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(float marketValue) {
        this.marketValue = marketValue;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }



}
