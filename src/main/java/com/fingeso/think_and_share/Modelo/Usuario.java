package com.fingeso.think_and_share.Modelo;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String run;
    private int numeroCelular;
    private int numeroTelefono;
    private String facebook;
    private String linkedln;
    private String instagram;
    private String correoAlaya;
    private int rol;

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setLinkedln(String linkedln) {
        this.linkedln = linkedln;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setCorreoAlaya(String correoAlaya) {
        this.correoAlaya = correoAlaya;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getRun(){
        return run;
    }

    public int getNumeroCelular(){
        return numeroCelular;
    }

    public int getNumeroTelefono(){
        return numeroTelefono;
    }

    public int getRol(){
        return rol;
    }
}

