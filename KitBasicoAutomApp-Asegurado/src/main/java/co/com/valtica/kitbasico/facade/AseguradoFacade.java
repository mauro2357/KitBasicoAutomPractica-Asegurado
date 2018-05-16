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
	public Boolean tieneLiquidez(Asegurado asegurado, boolean polizaEsFinanciada, int valorPoliza,
			boolean estaEnCentralRiesgo) {

		int excesoMensual = 0;
		int cuotaMensual = 0;
		boolean tieneLiquidez = true;
		if (polizaEsFinanciada)
		{
			int salario =asegurado.getSalario();
			int gastos = asegurado.getGastosFijos();
			double creditos =asegurado.getCreditos();
		excesoMensual = (int) (salario - gastos - creditos);
		cuotaMensual = valorPoliza/11;
		 
		tieneLiquidez = (excesoMensual>cuotaMensual) && estaEnCentralRiesgo && (asegurado.getEdad()>18);
		 
		}
		 
		return tieneLiquidez;
	}



}
