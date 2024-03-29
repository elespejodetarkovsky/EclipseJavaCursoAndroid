package com.sxtsoft.cajondesastre.gestiongastos.modelo.services.Impl;



import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.Gasto;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.Grupo;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.TipoGasto;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.Usuario;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.database.Context;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.database.DataBaseHelperGasto;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.services.GastoServices;
import com.sxtsoft.cajondesastre.projectmodel.Categoria;

public class GastoServicesImpl implements GastoServices {

    private DataBaseHelperGasto dataBaseHelperGasto;

    public GastoServicesImpl(Context context){
        dataBaseHelperGasto = new DataBaseHelperGasto(context);
    }

    @Override
    public List<Gasto> getAll() {
        return null;
    }

    @Override
    public Gasto gastoById(Long codigo) {
        return null;
    }


    @Override
    public List<Gasto> gastosByType(TipoGasto tipoGasto) {
        return null;
    }

    @Override
    public List<Gasto> gastosBetweenDates(Date fecha1, Date fecha2) {
        return null;
    }

    @Override
    public Map<String, Double> totalGastosBetweenDatesAndCategorias(Date fecha1, Date fecha2) {
        return dataBaseHelperGasto.totalGastosByDatesAndCategorias(fecha1, fecha2);
    }

    @Override
    public List<Gasto> gastosByArea(long latitud, long longitud) {
        return null;
    }

    @Override
    public List<Gasto> gastoByUser(Usuario usuario) {
        return null;
    }

    @Override
    public List<Gasto> gastoByGroup(Grupo grupo) {
        return null;
    }


    @Override
    public List<Gasto> gastosByCategoria(Categoria categoria) {
        return dataBaseHelperGasto.gastosByCategoria(categoria);
    }

    @Override
    public double SumaGastosByCategoria(Categoria categoria) {
        return dataBaseHelperGasto.SumaGastosByCategoria(categoria);
    }

    @Override
    public double sumaGastosMesTotal() {
        return dataBaseHelperGasto.SumaGastosMes();
    }

    @Override
    public List<Gasto> gastoByMonthInAYear(String month, int year) {
        return null;
    }

    @Override
    public List<Gasto> gastoByMonthBetweenYears(String month, int year1, int year2) {
        return null;
    }

    @Override
    public List<Gasto> obtenerUltimosGastos(int limite) {
        return dataBaseHelperGasto.obtenerUltimosGastos(limite);
    }

    @Override
    public List<Gasto> obtenerUltimosGastosUsuario(int limite, long userId) {
        return dataBaseHelperGasto.obtenerUltimosGastosUsuario(limite, userId);
    }

    @Override
    public double totalGastosByDatesCategoriasAndTipoGasto(Date fechaStart, Date fechaEnd, Categoria categoria, long tipoGastoId) {
        return dataBaseHelperGasto.totalGastosByDatesCategoriasAndTipoGasto(fechaStart, fechaEnd, categoria, tipoGastoId);
    }

    @Override
    public Gasto create(Gasto object) {
        return dataBaseHelperGasto.create(object);
    }

    @Override
    public Gasto read(Long codigo) {
        return null;
    }

    @Override
    public boolean delete(Long codigo) {
        return dataBaseHelperGasto.deleteGasto(codigo);
    }

    @Override
    public Gasto update(Gasto Object) {
        return null;
    }
}