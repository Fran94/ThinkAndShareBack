package com.fingeso.think_and_share.Modelo;

import java.util.ArrayList;

public class Evaluador extends Usuario{

    public Evaluador(String nombre, String run, int numeroCelular, int numeroTelefono, String facebook, String linkedln, String instagram, String correoAlaya, int rol) {
        this.setNombre(nombre);
        this.setRun(run);
        this.setNumeroCelular(numeroCelular);
        this.setNumeroTelefono(numeroTelefono);
        this.setFacebook(facebook);
        this.setLinkedln(linkedln);
        this.setInstagram(instagram);
        this.setCorreoAlaya(correoAlaya);
        this.setRol(rol);
    }

    public void cambiarRol() {}

    public void cerrarSesion() {}

    public void evaluarIdea() {}
}
