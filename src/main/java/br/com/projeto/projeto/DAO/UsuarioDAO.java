package br.com.projeto.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto.beans.Usuario;


public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{ 
	
	public Usuario findByEmailAndSenha(String email,String senha);
}
