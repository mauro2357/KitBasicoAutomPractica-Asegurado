package unit.co.com.valtica.kitbasico;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.valtica.kitbasico.entidades.Asegurado;
import co.com.valtica.kitbasico.facade.IAseguradoFacade;



public class AseguradoTest {
	
	@Autowired
	IAseguradoFacade aseguradoFacade;
	
	@Test
	public void buscarAsegurado() {
		assertTrue(true);
	}
	
	
}
