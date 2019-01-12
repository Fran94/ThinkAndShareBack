package com.fingeso.think_and_share.Modelo;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;

public class Ideador extends Usuario{
    @DBRef
    ArrayList<Idea> ideas;

    private boolean iniciarSesion(String run, String contrasena) {
        return true;
    }

    private void cambiarRol() {}

    private void cerrarSesion() {}

    private void publicarIdea(String titulo, String descripcion, int idDesafio) {}

    private void comentarIdea(String descripcion) {}

    private void darMeGusta() {}

    private void publicarComentario(String descripcion) {}

    private void editarComentarioPropio() {}
}
