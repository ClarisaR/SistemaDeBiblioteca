package com.universidad.materialBibliografico;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ServicioDeMaterialBibliograficoImpl implements ServicioDeMaterialBibliografico{
    private List<MaterialBibliografico> materialesBibliograficos;

    public ServicioDeMaterialBibliograficoImpl() {
        this.materialesBibliograficos = new LinkedList<>();
    }

    @Override
    public void registrarMaterialBibliografico(MaterialBibliografico materialBibliografico) throws MaterialBibligraficoException {
        Optional<MaterialBibliografico> materialBibliograficoOptional = Optional.ofNullable(materialBibliografico);
        if(materialBibliograficoOptional.isEmpty()){
            throw new MaterialBibligraficoException("El material bibliografico no puede ser null");
        }
        materialesBibliograficos.add(materialBibliograficoOptional.get());
    }

    @Override
    public MaterialBibliografico obtenerMaterialBibliografico(Long id) throws MaterialBibligraficoException {
        for (MaterialBibliografico mb:
             materialesBibliograficos) {
            if(mb.getId().equals(id)){
                return mb;
            }
        }
        throw new MaterialBibligraficoException("Material bibliografico no existente");
    }
}
