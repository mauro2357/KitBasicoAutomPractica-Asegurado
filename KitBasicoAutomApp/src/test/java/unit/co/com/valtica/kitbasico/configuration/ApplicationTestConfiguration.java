package unit.co.com.valtica.kitbasico.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import co.com.valtica.kitbasico.datos.AfiliadosRepository;
import co.com.valtica.kitbasico.datos.CiudadRepository;

@Profile("test")
@Configuration
public class ApplicationTestConfiguration {
	
	@Bean
    @Primary
    public AfiliadosRepository afiliadosRepository() {
        return Mockito.mock(AfiliadosRepository.class);
    }

	@Bean
    @Primary
    public CiudadRepository ciudadRepository() {
        return Mockito.mock(CiudadRepository.class);
    }
}
