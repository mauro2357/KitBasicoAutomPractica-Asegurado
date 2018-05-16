package co.com.valtica.kitbasico.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import co.com.valtica.kitbasico.entidades.Asegurado;
import co.com.valtica.kitbasico.facade.IAseguradoFacade;

@RestController
@RequestMapping("/api")
public class AseguradoController {

	@Autowired
	IAseguradoFacade aseguradoFacade;

	@PostMapping("/asegurado/valida")
	public String crearAfiliadoSegunSalario(@Valid @RequestBody String asegurado) {
		return asegurado;
	}

	@GetMapping("/asegurado/{id}")
	public String getAfiliadoById(@PathVariable(value = "id") Long id) {
		
		return aseguradoFacade.obtenerInformacionAsegurado(id).getTipoAsegurado();
	}

}
