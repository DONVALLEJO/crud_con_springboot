
package com.web.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @GetMapping("/hola")
    
    public String saludar(){
        
        return "Hola Alumnos";
    }
}
