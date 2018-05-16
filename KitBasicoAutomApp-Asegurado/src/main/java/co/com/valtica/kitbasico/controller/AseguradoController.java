package co.com.valtica.kitbasico.controller;

import javax.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import co.com.valtica.kitbasico.entidades.Afiliado;
//import co.com.valtica.kitbasico.facade.IAfiliadosFacade;

@RestController
@RequestMapping("/api")
public class AseguradoController {
/*
	 @Autowired
	 IAfiliadosFacade afiliadosFacade;*/
	 /*
	 @PostMapping("/afiliados")
	 public Afiliado crearAfiliado(@Valid @RequestBody Afiliado afiliado) {
	     return afiliadosFacade.afiliar(afiliado);
	 }*/
	 
	 @PostMapping("/asegurado/validar")
	 public boolean crearAfiliadoSegunSalario(@Valid @RequestBody String parametros) {
		 
	     return false;
	 }
	 
	 @GetMapping("/asegurado/{id}")
	 public String getAfiliadoById(@PathVariable(value = "id") String id) {
		 String valor = "{id_asegurado:1,tipo_identificacion:'DNI',num_identificacion:'123435',empresa:'GMD',poliza:'123'}";
	     return valor;
	 }
	
}
