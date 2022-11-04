package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {

    private static final String TEMPLATE = "Hola, %s!. Estàs executant un projecte Gradle.";
    @GetMapping("/HelloWorld")
    @ResponseBody
    public ResponseEntity saluda(@RequestParam(name = "nom", required = false, defaultValue = "UNKNOWN")
                                         String nom) {
        return new ResponseEntity(String.format(TEMPLATE, nom));
    }


    @GetMapping(value = {"/HelloWorld2/{nom}", "/HelloWorld2"})
    @ResponseBody
    public ResponseEntity saluda2(@PathVariable Optional<String> nom) {
        if (nom.isEmpty()) return new ResponseEntity(String.format(TEMPLATE, "UNKNOWN"));
        else return new ResponseEntity(String.format(TEMPLATE, nom.get()));
    }
}
