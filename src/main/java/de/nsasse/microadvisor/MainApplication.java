package de.nsasse.microadvisor;

//import de.nsasse.microadvisor.model.ProductType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
//import javax.inject.Inject;
import javax.inject.Named;


@SpringBootApplication
@ManagedBean
@Named
@Scope("session")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

//

    }

    public String printMsgFromSpring(){
        return "Hello Spring";
    }
}
