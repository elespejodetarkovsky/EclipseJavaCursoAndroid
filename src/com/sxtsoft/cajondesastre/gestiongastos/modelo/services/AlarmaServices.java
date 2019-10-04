package com.sxtsoft.cajondesastre.gestiongastos.modelo.services;

//import android.widget.ListView;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.Alarma;

import java.util.List;

public interface AlarmaServices extends  CRUDServices<Alarma, Long> {


    public boolean desactivarAlarma(long id); //pasará la alarma a estado inactivo

    public List<Alarma> getAll();

    public List<Alarma> verificarAlarmas(List<Alarma> alarmas, double sumaImportes);

}
