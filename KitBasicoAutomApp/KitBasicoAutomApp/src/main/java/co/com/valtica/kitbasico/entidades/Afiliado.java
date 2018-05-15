package co.com.valtica.kitbasico.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="afiliados")
public class Afiliado {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAfiliado;
	private String numeroIdentificacion;
	private String nombre;
	private String apellido;
	private String telefono;
	private int edad;
	private int salario;
	private long idCiudad;
	
	public Afiliado() {
		super();
	}
	
	public Afiliado(String numeroIdentificacion, String nombre, String apellido, String telefono, int edad, int salario, long idCiudad) {
		super();
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
		this.salario = salario;
		this.idCiudad = idCiudad;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getNombre() {
		return nombre+"Otra versio ";
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public long getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(long idCiudad) {
		this.idCiudad = idCiudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public boolean validar() {
		return this.edad >= 18;
	}
	
	public boolean validarSalario() {
		return this.salario > 1000000;
	}
	
	public boolean validarCiudad(Ciudad ciudad) {
		if(ciudad!= null && !ciudad.getNombre().isEmpty()) {
			return ciudad.getNombre().equals("LIMA");
		} else {
			return false;
		}		
	}


}
