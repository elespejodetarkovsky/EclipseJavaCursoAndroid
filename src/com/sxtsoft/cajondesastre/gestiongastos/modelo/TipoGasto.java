package com.sxtsoft.cajondesastre.gestiongastos.modelo;

import java.util.Date;

public class TipoGasto {

    private Long codigo;
    private String nombre;
    private Categoria categoria;
    private String icono;

    public TipoGasto () {

    }

    public TipoGasto (String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.setIcono(categoria.toString().toLowerCase());
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIcono() {
        return this.icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }


    @Override
    public String toString() {
        return "TipoGastoServices [codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + "icono=" + icono + "]";
    }





}