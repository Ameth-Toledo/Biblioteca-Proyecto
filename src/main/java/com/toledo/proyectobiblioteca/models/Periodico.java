package com.toledo.proyectobiblioteca.models;

public class Periodico extends Libro {
  private String contenido;
  public Periodico(){
    super();
  }

  public Periodico(String autor, String editorial, int numPaginas, String contenido) {
    super(autor, editorial, numPaginas);
    this.contenido = contenido;
  }

  public String getContenido() {
    return contenido;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  @Override
  public String toString() {
    return "Periodico{" +
            "contenido='" + contenido + '\'' +
            ", autor='" + autor + '\'' +
            ", editorial='" + editorial + '\'' +
            ", numPaginas=" + numPaginas +
            '}';
  }
}
