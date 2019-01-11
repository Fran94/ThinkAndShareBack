package com.fingeso.think_and_share.Modelo;

import java.util.ArrayList;

public class Idea {
    private String titulo;
    private String descripcon;
    private int meGusta;
    private int numeroComentarios;
    private int nota;
    private int idDesafio;
    private ArrayList<Comentario> comentarios;

    public Idea(String titulo, String descripcon, int numeroComentarios, int nota, int idDesafio, ArrayList<Comentario> comentarios) {
        this.titulo = titulo;
        this.descripcon = descripcon;
        this.meGusta = 0;
        this.numeroComentarios = numeroComentarios;
        this.nota = nota;
        this.idDesafio = idDesafio;
        this.comentarios = comentarios;
    }

    public int getMeGusta(){
        return this.meGusta;
    }

    private int modificarCantidadMeGusta() {
        this.meGusta++;
        return this.meGusta;
    }


}
