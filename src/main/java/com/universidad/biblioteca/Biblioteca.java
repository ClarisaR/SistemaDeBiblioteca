package com.universidad.biblioteca;

import com.universidad.materialBibliografico.ServicioDeMaterialBibliografico;
import com.universidad.prestamo.ServicioDePrestamo;
import com.universidad.usuario.ServicioDeUsuario;

public class Biblioteca {
    private ServicioDeMaterialBibliografico servicioDeMaterialBibliografico;
    private ServicioDePrestamo servicioDePrestamo;
    private ServicioDeUsuario servicioDeUsuario;
    private String nombre;
    public Biblioteca(ServicioDeUsuario servicioDeUsuario, ServicioDePrestamo servicioDePrestamo, ServicioDeMaterialBibliografico servicioDeMaterialBibliografico) {
        this.servicioDeUsuario = servicioDeUsuario;
        this.servicioDePrestamo = servicioDePrestamo;
        this.servicioDeMaterialBibliografico = servicioDeMaterialBibliografico;
    }

    public ServicioDeMaterialBibliografico getServicioDeMaterialBibliografico() {
        return servicioDeMaterialBibliografico;
    }

    public ServicioDePrestamo getServicioDePrestamo() {
        return servicioDePrestamo;
    }

    public ServicioDeUsuario getServicioDeUsuario() {
        return servicioDeUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
