package com.universidad.materialBibliografico;

public class Libro extends MaterialBibliografico {
    private String ISBN;
    private String autor;

    public Libro(String nombre, String editorial, Long id, String isbn, String autor) {
        super(nombre, editorial, id);
        this.ISBN = isbn;
        this.autor = autor;
    }
}
