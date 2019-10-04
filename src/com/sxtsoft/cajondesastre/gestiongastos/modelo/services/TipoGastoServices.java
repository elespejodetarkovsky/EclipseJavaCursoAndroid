package com.sxtsoft.cajondesastre.gestiongastos.modelo.services;



import java.util.List;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.TipoGasto;
import com.sxtsoft.cajondesastre.projectmodel.Categoria;

public interface TipoGastoServices extends CRUDServices<TipoGasto, Long> {

        /*
    Esta interface deberá dar de alta, eliminar y
    listar usuarios
     */

    public List<TipoGasto> getAll();

    public List<TipoGasto> getTiposByCategoria(Categoria categoria);

    public List<TipoGasto> setListaTipoGastos(List<TipoGasto> tipoGastos);

    public TipoGasto randomTipoGasto();

}
