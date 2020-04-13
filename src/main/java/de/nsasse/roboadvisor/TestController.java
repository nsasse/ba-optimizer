package de.nsasse.roboadvisor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optimizer")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello World!");
    }
}
