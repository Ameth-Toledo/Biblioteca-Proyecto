package com.toledo.proyectobiblioteca.models;

public class CantidadLibros {
    private String titulo;
    private String nombreReceptor;
    public CantidadLibros(){}
    public CantidadLibros(String titulo, String nombreReceptor) {
        this.titulo = titulo;
        this.nombreReceptor = nombreReceptor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    @Override
    public String toString() {
        return "cantidadLibros{" +
                "titulo='" + titulo + '\'' +
                ", nombreReceptor='" + nombreReceptor + '\'' +
                '}';
    }
}
