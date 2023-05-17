package com.universidad.materialBibliografico;

public class Revista extends MaterialBibliografico {
    private Boolean contienePublicidad;

    public Revista(String nombre, String editorial, Long id) {
        super(nombre, editorial, id);
    }
}
