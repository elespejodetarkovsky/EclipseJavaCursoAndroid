package com.sxtsoft.cajondesastre.gestiongastos.modelo.database;


import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.Gasto;
import com.sxtsoft.cajondesastre.projectmodel.Categoria;

public class DataBaseHelperGasto {


    private SQLiteDatabase db;

    public DataBaseHelperGasto(Context context){
       
    }


    public Cursor getAll() {

        Cursor cursor = db.rawQuery("SELECT * FROM " + Utilidades.GASTOS_TABLE, null);

        return cursor;
    }

    public Gasto create(Gasto gasto) {

    	return null;
    }

    public List<Gasto> gastosByCategoria(Categoria categoria){

    	return null;
    }

    public double SumaGastosByCategoria(Categoria categoria){
        double suma = 0;

        return 0;
    }

    public double SumaGastosMes(){

        /*
        Este método devuelve la suma de gastos
        en lo que va del mes
         */

        Calendar calendar = Calendar.getInstance();

        String mes = String.valueOf(calendar.get(Calendar.MONTH));
        String year = String.valueOf(calendar.get(Calendar.YEAR));

        //armo fecha inicial de primero del mes corriente
        String fechaInicio = "01-" + mes + "-" + year + " 00:00";

        long fechaInicioMili = Utilidades.dateToMilisegundos(Utilidades.stringToDate(fechaInicio));
        long fechaFinMili = Utilidades.dateToMilisegundos(new Date());


        //comienzo la consulta
        double suma = 0;

        String tabla = Utilidades.GASTOS_TABLE;

        String[] campos = {Utilidades.GASTOS_COL_1};

        String[] args = {String.valueOf(fechaInicioMili), String.valueOf(fechaFinMili)};

        Cursor cursor = db.rawQuery("SELECT SUM(" + Utilidades.GASTOS_COL_1 + ") FROM " + tabla + " WHERE "
                + Utilidades.GASTOS_COL_4 + " BETWEEN " + fechaInicioMili + " AND " + fechaFinMili, null);



        return 0;
    }

    public boolean deleteGasto(long codigo){

        String tabla = Utilidades.GASTOS_TABLE;

        int delete = db.delete(tabla,Utilidades.GASTOS_COL_0 + "=" + codigo,null);

        if (delete != -1){
            //se ha borrado correctamente
            return true;
        }

        return false;
    }

    public Map<String, Double> totalGastosByDatesAndCategorias(Date fechaStart, Date fechaEnd){

        String tabla = Utilidades.GASTOS_TABLE;

        long lngFecha1 = Utilidades.dateToMilisegundos(fechaStart);
        long lngFecha2 = Utilidades.dateToMilisegundos(fechaEnd);

        String sql = "SELECT SUM(" + Utilidades.GASTOS_COL_1 +")," +
                Utilidades.GASTOS_COL_5 + " FROM " + tabla +
                " WHERE " + Utilidades.GASTOS_COL_4 + " BETWEEN " +
                lngFecha1 + " AND " + lngFecha2 + " GROUP BY " + Utilidades.GASTOS_COL_5;

        //Cursor cursor = db.rawQuery(sql,null);


        Cursor cursor = db.rawQuery(sql,null);

        Map<String, Double> gastos = new HashMap<>();

            return null;
        
    }

    public double totalGastosByDatesCategoriasAndTipoGasto(Date fechaStart, Date fechaEnd, Categoria categoria, long tipoGastoId){

        String tabla = Utilidades.GASTOS_TABLE;

        long lngFecha1 = Utilidades.dateToMilisegundos(fechaStart);
        long lngFecha2 = Utilidades.dateToMilisegundos(fechaEnd);

        String sql = "SELECT SUM(" + Utilidades.GASTOS_COL_1 +")," +
                " FROM " + tabla + " WHERE " + Utilidades.GASTOS_COL_3 + "=" + tipoGastoId +
                " AND " + Utilidades.GASTOS_COL_5 + "=" + categoria.toString() + " BETWEEN " +
                lngFecha1 + " AND " + lngFecha2;

        //Cursor cursor = db.rawQuery(sql,null);


        Cursor cursor = db.rawQuery(sql,null);

        double importeTotal = 0;


        return importeTotal;

    }


    public List<Gasto> obtenerUltimosGastos(int limite){
        /*
        obtendr'a los ultimos n registros
        ingresados
         */

        String tabla = Utilidades.GASTOS_TABLE;
        String tablaTipos = Utilidades.TIPOGASTOS_TABLE;


        StringBuilder sb = new StringBuilder();
            sb.append(tabla + "." + Utilidades.GASTOS_COL_0 + ", ");
            sb.append(tabla + "." + Utilidades.GASTOS_COL_1 + ", ");
            sb.append(tabla + "." + Utilidades.GASTOS_COL_2 + ", ");
            sb.append(tabla + "." + Utilidades.GASTOS_COL_3 + ", ");
            sb.append(tabla + "." + Utilidades.GASTOS_COL_4 + ", ");
            sb.append(tabla + "." + Utilidades.GASTOS_COL_5 + ", ");
            sb.append(Utilidades.TIPOGASTOS_TABLE + "." + Utilidades.TIPOGASTO_COL_1 + ", ");
            sb.append(Utilidades.TIPOGASTOS_TABLE + "." + Utilidades.TIPOGASTO_COL_3);


        String sql = "SELECT " + sb.toString() + " FROM " + tabla + " INNER JOIN " +
                tablaTipos + " ON " + tabla + "." + Utilidades.GASTOS_COL_3 + "=" +
                tablaTipos + "." + Utilidades.TIPOGASTO_COL_0
                + " ORDER BY " + Utilidades.GASTOS_COL_0 + " DESC LIMIT " + limite;



        Cursor cursor = db.rawQuery(sql,null);

        List<Gasto> gastos = new ArrayList<>();

      

            return null;
      

    }

    public List<Gasto> obtenerUltimosGastosUsuario(int limite, long idUsuario){
        /*
        obtendr'a los ultimos n registros
        ingresados
         */

        String tablaGastos = Utilidades.GASTOS_TABLE;
        String tablaTipos = Utilidades.TIPOGASTOS_TABLE;
        String tablaUsuarios = Utilidades.USUARIOS_TABLE;


        StringBuilder sb = new StringBuilder();
        sb.append(tablaGastos + "." + Utilidades.GASTOS_COL_0 + ", ");
        sb.append(tablaGastos + "." + Utilidades.GASTOS_COL_1 + ", ");
        sb.append(tablaGastos + "." + Utilidades.GASTOS_COL_2 + ", ");
        sb.append(tablaGastos + "." + Utilidades.GASTOS_COL_3 + ", ");
        sb.append(tablaGastos + "." + Utilidades.GASTOS_COL_4 + ", ");
        sb.append(tablaGastos + "." + Utilidades.GASTOS_COL_5 + ", ");
        sb.append(tablaTipos + "." + Utilidades.TIPOGASTO_COL_1 + ", ");
        //sb.append(tablaTipos + "." + Utilidades.TIPOGASTO_COL_3 + ", ");
        sb.append(tablaUsuarios + "." + Utilidades.USUARIOS_COL_3);


        String sql = "SELECT " + sb.toString() + " FROM " + tablaGastos + " INNER JOIN " +
                tablaTipos + " ON " + tablaGastos + "." + Utilidades.GASTOS_COL_3 + "=" +
                tablaTipos + "." + Utilidades.TIPOGASTO_COL_0 + " INNER JOIN " + tablaUsuarios + " ON " +
                tablaGastos + "." + Utilidades.GASTOS_COL_2 + "=" + tablaUsuarios + "." + Utilidades.USUARIOS_COL_0
                + " ORDER BY " + Utilidades.GASTOS_COL_0 + " DESC LIMIT " + limite;

        return null;
    }
}
