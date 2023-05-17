package com.universidad.usuario;

public class Usuario {
    private String nombre;
    private Long id;

    public Usuario(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
