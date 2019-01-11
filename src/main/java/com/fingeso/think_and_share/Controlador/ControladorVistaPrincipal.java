package com.fingeso.think_and_share.Controlador;

import com.fingeso.think_and_share.Modelo.Idea;

public class ControladorVistaPrincipal {
    public void publicarIdea(int rol, String titulo, String descripcion) {}

    public void publicarDesafio(int rol) {}

    public void cerrarSesion() {}

    public int darMeGusta(Idea idea) {
        return idea.getMeGusta();
    }

    public void verPerfil() {}

}
