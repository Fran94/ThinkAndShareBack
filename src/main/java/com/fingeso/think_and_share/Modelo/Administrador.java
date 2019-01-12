package com.fingeso.think_and_share.Modelo;

public class Administrador extends Usuario{

    public boolean cambiarRol(int nuevoRol) {
        if(getRol()!=nuevoRol){
            return true;
        }
        return false;
    }

    public void cerrarSesion() {}

    public void crearDesafio() {}

    public void eliminarComentario() {}

    Administrador(){
        setRol(1);
    }
}
