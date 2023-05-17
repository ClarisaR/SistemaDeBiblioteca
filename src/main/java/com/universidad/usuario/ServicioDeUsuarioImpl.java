package com.universidad.usuario;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ServicioDeUsuarioImpl implements ServicioDeUsuario{
    private final List<Usuario> usuarios;

    public ServicioDeUsuarioImpl() {
        this.usuarios = new LinkedList<>();
    }

    @Override
    public void registrarUsuario(Usuario usuario) throws UsuarioException {
        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuario);
        if(usuarioOptional.isEmpty()){
            throw new UsuarioException("El usuario no puede ser null");
        }
        usuarios.add(usuarioOptional.get());
    }

    @Override
    public Usuario obtenerUsuario(Long id) throws UsuarioException {
        for (Usuario usuario:
             usuarios) {
            if(usuario.getId().equals(id)){
                return usuario;
            }
        }
        throw new UsuarioException("Usuario no existente");
    }
}
