package com.pukasoft.app.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControl {


    @GetMapping("/hola")
    public String saludar(){
        return "Hola Mundo";
    }


}
