package com.eldar.EldarChallenge;


import com.Eldar.Domain.Tarjeta;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControllerInicio {

    @GetMapping("/")
    public String inicio(Model model) {

        var tarjeta = new Tarjeta();
        tarjeta.setNombreCardHolder("santi");
        tarjeta.setApellidoCardHolder("sev");
        
        var tarjeta2 = new Tarjeta();
        tarjeta2.setNombreCardHolder("jorge");
        tarjeta2.setApellidoCardHolder("martin");
        
        List<Tarjeta> tarjetas = new ArrayList();
        tarjetas.add(tarjeta);
        tarjetas.add(tarjeta2);
       

        model.addAttribute("tarjetas", tarjetas);

        return "index";
    }

}
