package com.mycompany.bibliotecapoo;

public class Libro {
    private String titulo;//O(1)
    private String autor;//O(1)
    private int anioPubli;//O(1)
    private String genero;//O(1)
    private boolean leido;//O(1)

    //Complejidad temporal: O(1) Tiempo constante.
    public Libro(String titulo, String autor, int anioPubli, String genero, boolean leido) {
        this.titulo = titulo;//O(1)
        this.autor = autor;//O(1)
        this.anioPubli = anioPubli;//O(1)
        this.genero = genero;//O(1)
        this.leido = false;//O(1)
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anioPubli + ", Género: " + genero;//O(1)
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public void marcarLeido() {
        leido = true;//O(1)
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public boolean isLeido() {
        return leido;//O(1)
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public boolean esAntiguo() {
        if (anioPubli < 1974) {
            return true;
        }//O(1)
        return false;//O(1)
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public String getTitulo() {
        return titulo;
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public String getAutor() {
        return autor;
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public String getGenero() {
        return genero;

    }
}