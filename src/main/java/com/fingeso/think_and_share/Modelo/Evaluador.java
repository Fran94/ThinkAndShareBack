package com.fingeso.think_and_share.Modelo;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private String run;
    private int numeroCelular;
    private int numeroTelefono;
    private String facebook;
    private String linkedln;
    private String instagram;
    private String correoAlaya;
    private int rol;
    public ArrayList<Integer> roles;

    public Evaluador(String nombre, String run, int numeroCelular, int numeroTelefono, String facebook, String linkedln, String instagram, String correoAlaya, int rol) {
        this.nombre = nombre;
        this.run = run;
        this.numeroCelular = numeroCelular;
        this.numeroTelefono = numeroTelefono;
        this.facebook = facebook;
        this.linkedln = linkedln;
        this.instagram = instagram;
        this.correoAlaya = correoAlaya;
        this.rol = rol;
    }

    public void cambiarRol() {}

    public void cerrarSesion() {}

    public void evaluarIdea() {}
}
