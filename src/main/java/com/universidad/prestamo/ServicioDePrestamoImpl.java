package com.universidad.prestamo;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ServicioDePrestamoImpl implements ServicioDePrestamo {
    private final List<Prestamo> prestamos;

    public ServicioDePrestamoImpl() {
        this.prestamos = new LinkedList<>();
    }

    @Override
    public void registrarPrestamo(Prestamo prestamo) {
        Optional<Prestamo> prestamoOptional = Optional.ofNullable(prestamo);
        if (prestamoOptional.isEmpty()) {
            throw new RuntimeException();
        }
        prestamos.add(prestamoOptional.get());
    }
}
