package com.sxtsoft.cajondesastre.gestiongastos.modelo.services.Impl;


import java.util.List;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.services.AlarmaServices;
import com.sxtsoft.gestiongastos.database.DatabaseHelperAlarma;


public class AlarmaServicesImpl implements AlarmaServices {

    private DatabaseHelperAlarma databaseHelperAlarma;

    public AlarmaServicesImpl(Context context){
        databaseHelperAlarma = new DatabaseHelperAlarma(context);
    }

    @Override
    public boolean desactivarAlarma(long id) {
        return false;
    }

    @Override
    public List<Alarma> getAll() {
        return databaseHelperAlarma.getAll();
    }

    @Override
    public List<Alarma> verificarAlarmas(List<Alarma> alarmas, double sumaImportes) {
        return databaseHelperAlarma.verificarAlarmas(alarmas, sumaImportes);
    }

    @Override
    public Alarma create(Alarma alarma) {
        return databaseHelperAlarma.crearAlarma(alarma);
    }

    @Override
    public Alarma read(Long codigo) {
        return null;
    }

    @Override
    public boolean delete(Long codigo) {
        return false;
    }

    @Override
    public Alarma update(Alarma alarma) {
        return null;
    }
}
