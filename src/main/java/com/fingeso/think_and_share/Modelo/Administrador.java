package com.fingeso.think_and_share.Modelo;

public class Administrador {
    private String nombre;
    private String run;
    private int numeroCelular;
    private int numeroTelefono;
    private String facebook;
    private String linkedln;
    private String instagram;
    private String correoAlaya;
    private int rol;

    public boolean cambiarRol(int nuevoRol) {
        if(rol!=nuevoRol){
            return true;
        }
        return false;
    }

    public void cerrarSesion() {}

    public void crearDesafio() {}

    public void eliminarComentario() {}

    Administrador(){
        rol = 1;
    }
}
