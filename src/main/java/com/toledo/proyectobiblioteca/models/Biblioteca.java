package com.toledo.proyectobiblioteca.models;

import java.util.ArrayList;

public class Biblioteca  {
    private ArrayList<Libro> listLibro = new ArrayList<>();
    private ArrayList<CantidadLibros> listCantLibros = new ArrayList<>();
    public boolean addCant (CantidadLibros cantidadLibros1){ return listCantLibros.add(cantidadLibros1);}
    public boolean addLibros( Libro libro){
        return listLibro.add(libro);
    }

    public ArrayList<Libro> getListLibro() {
        return listLibro;
    }

    public void setListLibro(ArrayList<Libro> listLibro) {
        this.listLibro = listLibro;
    }

    public ArrayList<CantidadLibros> getListCantLibros() {
        return listCantLibros;
    }

    public void setListCantLibros(ArrayList<CantidadLibros> listCantLibros) {
        this.listCantLibros = listCantLibros;
    }
}
