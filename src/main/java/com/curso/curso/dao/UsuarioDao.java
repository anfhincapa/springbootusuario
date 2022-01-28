package com.curso.curso.dao;

import java.util.List;

import com.curso.curso.modelo.Usuario;

public interface UsuarioDao {
	
	List<Usuario> getUsuarios();

	void eliminar(Long id);

	void registrar(Usuario usuario);

	Usuario obtenerUsuariosPorCredenciales(Usuario usuario);

}
