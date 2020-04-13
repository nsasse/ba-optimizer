package de.nsasse.roboadvisor.controller;

import de.nsasse.roboadvisor.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@Component
@RequestScoped
@ManagedBean
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
