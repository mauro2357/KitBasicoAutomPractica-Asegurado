package co.com.valtica.kitbasico.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.valtica.kitbasico.datos.AfiliadosRepository;
import co.com.valtica.kitbasico.datos.CiudadRepository;
import co.com.valtica.kitbasico.entidades.Afiliado;
import co.com.valtica.kitbasico.entidades.Ciudad;

@Component
public class AfiliadosFacade implements IAfiliadosFacade{
	
	@Autowired
	AfiliadosRepository afiliadosRepository;
	
	@Autowired
	CiudadRepository ciudadRepository;
	
	public Afiliado afiliar(Afiliado afiliado) {
		if(afiliado.validar()) {
			return afiliadosRepository.save(afiliado);
		}
		
		else if(afiliado.validarCiudad(findByIdCiudad(afiliado.getIdCiudad()))) {
			return afiliadosRepository.save(afiliado);
		}
		
		else {
			return null;
		}
	}
	
	public Afiliado afiliarSegunSalario(Afiliado afiliado) {
		if(afiliado.validarSalario()) {
			return afiliadosRepository.save(afiliado);
		}else {
			return null;
		}
	}
	
	public Afiliado findById(long id) {
		return afiliadosRepository.findById(id)
        .orElse(new Afiliado());
	}
	
	public Ciudad findByIdCiudad(long id) {
		return ciudadRepository.findById(id)
        .orElse(new Ciudad());
	}

}
