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

    public String getType() {
        return name;
    }

    public void setType(String name) {
        this.name = name;
    }
}
