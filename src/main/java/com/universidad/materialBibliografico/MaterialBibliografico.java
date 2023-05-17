package com.universidad.materialBibliografico;

public abstract class MaterialBibliografico {
    private String nombre;
    private String editorial;
    private Long id;

    public MaterialBibliografico(String nombre, String editorial, long id) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
