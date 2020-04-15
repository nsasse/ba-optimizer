package de.nsasse.roboadvisor.controller;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class OptimizerController {

    @Inject
    OptimizerController optimizerController;

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void printProductName() {
        System.out.println(this.productName);
    }
}
