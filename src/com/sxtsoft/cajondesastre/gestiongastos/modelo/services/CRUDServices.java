package com.sxtsoft.cajondesastre.gestiongastos.modelo.services;

public interface CRUDServices<T, K> {
    /*
    Interface que obligará a la aplicacion
    de operaciones CRUD
     */


    public T create(T t);

    public T read(K codigo);

    public boolean delete(K codigo); //elimina usuario en funcion de su nombre de usuario

    public T update(T t);

}
