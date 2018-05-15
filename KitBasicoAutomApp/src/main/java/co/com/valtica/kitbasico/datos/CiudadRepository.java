package co.com.valtica.kitbasico.datos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.valtica.kitbasico.entidades.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}