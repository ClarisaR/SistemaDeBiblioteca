package com.universidad.usuario;

public interface ServicioDeUsuario {
    void registrarUsuario(Usuario usuario) throws UsuarioException;

    Usuario obtenerUsuario(Long id) throws UsuarioException;
}
