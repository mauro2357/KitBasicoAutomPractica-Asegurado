package co.com.valtica.kitbasico.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.valtica.kitbasico.datos.AseguradoRepository;
import co.com.valtica.kitbasico.entidades.Asegurado;

@Component
public class AseguradoFacade implements IAseguradoFacade {

	@Autowired
	AseguradoRepository aseguradoRepositorio;
	
	@Override
	public Asegurado afiliar(Asegurado Asegurado) {
 
		return null;
	}

	@Override
	public Asegurado findById(long id) {
 
		return null;
	}

	@Override
	public Asegurado afiliarSegunSalario(Asegurado Asegurado) {
 
		return null;
	}

	@Override
	public Asegurado obtenerInformacionAsegurado(long id) {
 
		return aseguradoRepositorio.getOne(id); 
	}

	@Override
	public Asegurado tieneLiquidez(Asegurado asegurado) {
		// TODO Auto-generated method stub
		return null;
	}

}
