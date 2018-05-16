package unit.co.com.valtica.kitbasico.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import co.com.valtica.kitbasico.datos.AseguradoRepository;

@Profile("test")
@Configuration
public class ApplicationTestConfiguration {
		
	@Bean
	@Primary
	public AseguradoRepository aseguradoRespositorio() {
		return Mockito.mock(AseguradoRepository.class);
	}
	
}
