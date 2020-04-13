package de.nsasse.roboadvisor.controller;

import de.nsasse.roboadvisor.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request")
public class OptimizerBean {

    @Autowired
    RestService restService;

    private String string = "Test String";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
