package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
/*
	@PostMapping("/inserir/{cod}")
	public void apagarArtista(@PathVariable int cod) {
		try {
		dao.deleteById(cod);

		} catch(Exception e){
			e.printStackTrace();
		}
	}	
	*/
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta =dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta ==null) {
			return ResponseEntity.status(404).build();
			
		}
		return ResponseEntity.ok(resposta);
		
	}
	
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/usuario/{cod}")
	public ResponseEntity<Usuario> getUser(@PathVariable int cod) {
		Usuario objeto = dao.findById(cod).orElse(null);
		if (objeto==null) {
			return ResponseEntity.status(404).build();
			//return new Usuario(0,"Não encontrado", "","","");
		}
		return ResponseEntity.ok(objeto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
