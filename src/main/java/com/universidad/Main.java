package com.universidad;

import com.universidad.biblioteca.Biblioteca;
import com.universidad.materialBibliografico.Libro;
import com.universidad.materialBibliografico.MaterialBibligraficoException;
import com.universidad.materialBibliografico.ServicioDeMaterialBibliografico;
import com.universidad.materialBibliografico.ServicioDeMaterialBibliograficoImpl;
import com.universidad.prestamo.Prestamo;
import com.universidad.prestamo.ServicioDePrestamo;
import com.universidad.prestamo.ServicioDePrestamoImpl;
import com.universidad.usuario.ServicioDeUsuario;
import com.universidad.usuario.ServicioDeUsuarioImpl;
import com.universidad.usuario.Usuario;
import com.universidad.usuario.UsuarioException;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ServicioDeUsuario servicioDeUsuario = new ServicioDeUsuarioImpl();
        ServicioDePrestamo servicioDePrestamo = new ServicioDePrestamoImpl();
        ServicioDeMaterialBibliografico servicioDeMaterialBibliografico = new ServicioDeMaterialBibliograficoImpl();

        Biblioteca biblioteca = new Biblioteca(servicioDeUsuario, servicioDePrestamo, servicioDeMaterialBibliografico);

        biblioteca.setNombre("Leopoldo Marechal");
        ServicioDeUsuario su = biblioteca.getServicioDeUsuario();
        try {
            su.registrarUsuario(new Usuario("Clarisa", 1L));
            su.registrarUsuario(null);
        } catch (UsuarioException e) {
            System.out.println(e.getMessage());
        }
        ServicioDeMaterialBibliografico smb = biblioteca.getServicioDeMaterialBibliografico();
        try {
            smb.registrarMaterialBibliografico(new Libro("El Túnel", "Baires", 1L, "12345678", "Ernesto Sabato"));
        } catch (MaterialBibligraficoException e) {
            System.out.println(e.getMessage());
        }
        ServicioDePrestamo sp = biblioteca.getServicioDePrestamo();
        try {
            sp.registrarPrestamo(new Prestamo(servicioDeUsuario.obtenerUsuario(1L), servicioDeMaterialBibliografico.obtenerMaterialBibliografico(1L), 1L, LocalDateTime.now()));
        } catch (UsuarioException | MaterialBibligraficoException e) {
            System.out.println(e.getMessage());
        }
    }
}