package de.nsasse.roboadvisor.model;

import java.io.Serializable;

public class ProductType implements Serializable {

    private long id;

    private String name;

    public ProductType() {
    }

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
}