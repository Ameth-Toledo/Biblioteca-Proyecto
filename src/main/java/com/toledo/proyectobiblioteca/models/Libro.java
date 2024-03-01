package com.toledo.proyectobiblioteca.models;
import java.util.Objects;

public class Libro {
    protected String autor;
    protected String editorial;
    protected int numPaginas;
    public Libro(){}
    public Libro(String autor, String editorial, int numPaginas) {
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Autor='" + autor + '\'' +
                ", Editorial='" + editorial + '\'' +
                ", NumPaginas=" + numPaginas +
                '}';
    }
}