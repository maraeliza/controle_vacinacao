package web.controlevacinacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VacinaController {

    @GetMapping("/vacinas")
    public String mostrarTodasVacinas() {
        
    }
    
}
