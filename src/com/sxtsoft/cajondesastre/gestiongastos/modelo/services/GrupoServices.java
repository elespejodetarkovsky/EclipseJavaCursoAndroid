package com.sxtsoft.cajondesastre.gestiongastos.modelo.services;


import java.util.List;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.Grupo;

public interface GrupoServices extends CRUDServices<Grupo, Long> {

    public List<Grupo> getAll();

}
