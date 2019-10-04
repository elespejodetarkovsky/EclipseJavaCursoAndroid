package com.sxtsoft.cajondesastre.gestiongastos.modelo.services;



import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.Gasto;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.Grupo;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.TipoGasto;
import com.sxtsoft.cajondesastre.gestiongastos.modelo.Usuario;
import com.sxtsoft.cajondesastre.projectmodel.Categoria;

public interface GastoServices extends CRUDServices<Gasto, Long>{


    public List<Gasto> getAll(); //busca todos los gastos...probablemente no sea utilizada.

    public Gasto gastoById(Long codigo); //devuelvo un gasto por su código


    public List<Gasto> gastosByType(TipoGasto tipoGasto);

    public List<Gasto> gastosBetweenDates(Date fecha1, Date fecha2);

    public Map<String, Double> totalGastosBetweenDatesAndCategorias(Date fecha1, Date fecha2);

    public List<Gasto> gastosByArea(long latitud, long longitud); //devolvería los gastos realizados en un area determinada

    public List<Gasto> gastoByUser(Usuario usuario);

    public List<Gasto> gastoByGroup(Grupo grupo);

    public List<Gasto> gastosByCategoria(Categoria categoria); //SERVICIOS, CORRIENTES

    public double SumaGastosByCategoria(Categoria categoria);

    public double sumaGastosMesTotal();

    public List<Gasto> gastoByMonthInAYear(String month, int year);

    public List<Gasto> gastoByMonthBetweenYears(String month, int year1, int year2);

    public List<Gasto> obtenerUltimosGastos(int limite);

    public List<Gasto> obtenerUltimosGastosUsuario(int limite, long userId);

    public double totalGastosByDatesCategoriasAndTipoGasto(Date fechaStart, Date fechaEnd, Categoria categoria, long tipoGastoId);


}
