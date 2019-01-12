package com.fingeso.think_and_share;

import com.fingeso.think_and_share.Controlador.ControladorVistaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fingeso.think_and_share.Controlador.ControladorVistaPrincipal;

@SpringBootApplication
public class ThinkAndShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinkAndShareApplication.class, args);
        ControladorVistaPrincipal cvp = new ControladorVistaPrincipal();
        String s = "Hola";
        cvp.escribir(s);
    }
}

