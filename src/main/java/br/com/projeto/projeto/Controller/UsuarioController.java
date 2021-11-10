package br.com.projeto.projeto.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import br.com.projeto.projeto.beans.Usuario;
import br.com.projeto.projeto.DAO.UsuarioDAO;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/Usuario")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> list = (List<Usuario>)dao.findAll();
	
		if(list.size()==0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(list);
	}
	@GetMapping("/lucas{userId}")
    public ResponseEntity<Optional<Usuario>> getAllById(@PathVariable("userId") int id){
        Optional<Usuario> listId = dao.findById(id);

        if(listId.isEmpty()) { return ResponseEntity.status(404).build(); }

        return ResponseEntity.ok(listId);
    }
	
}