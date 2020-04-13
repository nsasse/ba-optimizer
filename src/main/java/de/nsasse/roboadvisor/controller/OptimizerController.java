package de.nsasse.roboadvisor.controller;

import de.nsasse.roboadvisor.model.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optimizer")
public class OptimizerController {

    @CrossOrigin
    @GetMapping
    public Product getOptimalProduct() {
        return null;
    }
}
