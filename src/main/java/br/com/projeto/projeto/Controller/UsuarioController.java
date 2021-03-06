package br.com.projeto.projeto.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import br.com.projeto.projeto.beans.Usuario;
import br.com.projeto.projeto.DAO.UsuarioDAO;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/ble")
	   public String homeApp() {
		   return "index";
	   }
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

	@PostMapping("/novousario")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario objeto){
       try {
        	dao.save(objeto);
        	return ResponseEntity.status(403).build();
        }catch(Exception e) {
        	e.printStackTrace();
        	return ResponseEntity.status(403).build();
        }

	}   
    

   @PostMapping("/login")
   public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
	   Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(),objeto.getSenha());
	   
	   if (resposta==null) {
		   return ResponseEntity.status(404).build();
	   }
   
   return ResponseEntity.ok(objeto);
}	
  
}