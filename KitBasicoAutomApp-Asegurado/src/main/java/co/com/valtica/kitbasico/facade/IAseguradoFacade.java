package co.com.valtica.kitbasico.facade;

import co.com.valtica.kitbasico.entidades.Asegurado;

public interface IAseguradoFacade {

	public Asegurado afiliar(Asegurado Asegurado);

	public Asegurado findById(long id);

	public Asegurado afiliarSegunSalario(Asegurado Asegurado);

	public Asegurado obtenerInformacionAsegurado(long id);
}
