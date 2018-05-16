package co.com.valtica.kitbasico.facade;

import co.com.valtica.kitbasico.entidades.Asegurado;

public interface IAseguradoFacade {

	
	public Asegurado obtenerInformacionAsegurado(long id);
	
	public Boolean tieneLiquidez(Asegurado asegurado,boolean polizaEsFinanciada, int valorPoliza, boolean estaEnCentralRiesgo);
}
