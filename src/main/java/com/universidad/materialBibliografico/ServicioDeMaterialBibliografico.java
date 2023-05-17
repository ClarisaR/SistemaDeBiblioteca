package com.universidad.materialBibliografico;

public interface ServicioDeMaterialBibliografico {
    void registrarMaterialBibliografico(MaterialBibliografico materialBibliografico) throws MaterialBibligraficoException;

    MaterialBibliografico obtenerMaterialBibliografico(Long id) throws MaterialBibligraficoException;
}
