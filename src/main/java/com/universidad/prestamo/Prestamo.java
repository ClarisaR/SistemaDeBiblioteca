package com.universidad.prestamo;

import com.universidad.materialBibliografico.MaterialBibliografico;
import com.universidad.usuario.Usuario;

import java.time.LocalDateTime;

public class Prestamo {
    private LocalDateTime fecha;
    private Long id;
    private Usuario usuario;
    private MaterialBibliografico materialBibliografico;

    public Prestamo(Usuario usuario, MaterialBibliografico materialBibliografico, Long id, LocalDateTime fecha) {
        this.usuario = usuario;
        this.materialBibliografico = materialBibliografico;
        this.fecha = fecha;
        this.id = id;
    }
}
