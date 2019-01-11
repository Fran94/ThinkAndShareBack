package com.fingeso.think_and_share.Modelo;

import java.util.ArrayList;

public class Ideador {
    public String nombre;
    public String run;
    public int numeroCelular;
    public int numeroTelefono;
    public String facebook;
    public String linkedln;
    public String instagram;
    public String correoAlaya;
    public ArrayList<Idea> ideas;

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
