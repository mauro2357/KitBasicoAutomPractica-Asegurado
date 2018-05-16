package co.com.valtica.kitbasico.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "asegurado")
@Entity(name = "afiliados")
public class Asegurado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDASEGURADO")
	private Long idAsegurado;
	@Column(name = "NOMBRES")
	private String nombres;
	@Column(name = "APELLIDOS")
	private String apellidos;
	@Column(name = "EDAD")
	private Integer edad;
	@Column(name = "TIPO_ASEGURADO")
	private String tipoAsegurado;
	@Column(name = "EMPRESA")
	private String empresa;
	@Column(name = "SALARIO")
	private Integer salario;
	@Column(name = "CREDITOS")
	private Integer creditos;
	@Column(name = "GASTOS_FIJOS")
	private Integer gastosFijos;
	@Column(name = "ID_POLIZA")
	private String id_poliza;

	public Asegurado() {
	}

	public Asegurado(Long idAsegurado, String nombres, String apellidos, Integer edad, String tipoAsegurado,
			String empresa, Integer salario, Integer creditos, Integer gastosFijos, String id_poliza) {
		this.idAsegurado = idAsegurado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tipoAsegurado = tipoAsegurado;
		this.empresa = empresa;
		this.salario = salario;
		this.creditos = creditos;
		this.gastosFijos = gastosFijos;
		this.id_poliza = id_poliza;
	}

	public Long getIdAsegurado() {
		return idAsegurado;
	}

	public void setIdAsegurado(Long idAfiliado) {
		this.idAsegurado = idAfiliado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTipoAsegurado() {
		return tipoAsegurado;
	}

	public void setTipoAsegurado(String tipoAsegurado) {
		this.tipoAsegurado = tipoAsegurado;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Integer getGastosFijos() {
		return gastosFijos;
	}

	public void setGastosFijos(Integer gastosFijos) {
		this.gastosFijos = gastosFijos;
	}

	public String getId_poliza() {
		return id_poliza;
	}

	public void setId_poliza(String id_poliza) {
		this.id_poliza = id_poliza;
	}

}
