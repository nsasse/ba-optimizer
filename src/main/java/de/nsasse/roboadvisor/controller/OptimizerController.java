package de.nsasse.roboadvisor.controller;

import de.nsasse.roboadvisor.model.Product;
import de.nsasse.roboadvisor.service.RestService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;

//@RestController
//@RequestMapping("/optimizer")
@Named
public class OptimizerController {

//    @CrossOrigin
//    @GetMapping
//    public Product getOptimalProduct() {
//        return null;
//    }

    @Inject
    RestService restService;

    private String productName = "TestProdName";

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void printProductName() {
        restService.getProducts();
        System.out.println(this.productName);
    }

}
