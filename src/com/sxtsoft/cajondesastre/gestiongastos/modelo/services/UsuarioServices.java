package com.sxtsoft.cajondesastre.gestiongastos.modelo.services;


import java.util.List;

import com.sxtsoft.cajondesastre.gestiongastos.modelo.Usuario;

public interface UsuarioServices extends CRUDServices<Usuario, Long>{

    /*
    Esta interface deberá dar de alta, eliminar y
    listar usuarios
     */

    public List<Usuario> getAll();

    public long logIn(String userName, String clave);

    public Usuario UsuarioById(long userID);

}
