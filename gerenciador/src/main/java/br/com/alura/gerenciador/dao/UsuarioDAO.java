package br.com.alura.gerenciador.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.gerenciador.Usuario;

public class UsuarioDAO {

	private final static Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("andre", new Usuario("andre", "123"));
		USUARIOS.put("abel", new Usuario("abel", "123"));
	}

	public Usuario buscaPorEmailESenha(String email, String senha) {
		if (!USUARIOS.containsKey(email))
			return null;

		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha))
			return usuario;

		return null;
	}

}
