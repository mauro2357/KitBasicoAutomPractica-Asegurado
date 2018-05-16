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

	
	@GetMapping("/asegurado/{id}")
	public String getAfiliadoById(@PathVariable(value = "id") Long id) {

		return aseguradoFacade.obtenerInformacionAsegurado(id).getTipoAsegurado();
	}

	@PostMapping("/asegurado/valida")
	public boolean tieneLiquidez(@Valid @RequestBody int ID_Asegurado) {
		
		Asegurado ase = new Asegurado();
		ase.setSalario(aseguradoFacade.obtenerInformacionAsegurado(ID_Asegurado).getSalario());
		ase.setGastosFijos(aseguradoFacade.obtenerInformacionAsegurado(ID_Asegurado).getGastosFijos());
		ase.setEdad(aseguradoFacade.obtenerInformacionAsegurado(ID_Asegurado).getEdad());
		ase.setCreditos(aseguradoFacade.obtenerInformacionAsegurado(ID_Asegurado).getCreditos());
		
		boolean polizaEsFinanciada = polizaEsFinanciada();
		int valorPoliza = obtenerValorPoliza();
		boolean estaEnCentralRiesgo = estaEnCentralRiesgo();
		return aseguradoFacade.tieneLiquidez(ase, polizaEsFinanciada, valorPoliza, estaEnCentralRiesgo);
	}
	
	public boolean polizaEsFinanciada()
	{
	return true;
	}
	 
	public int obtenerValorPoliza()
	{
	return 100;
	}
	 
	 
	public boolean estaEnCentralRiesgo()
	{
	return true;
	}
}
