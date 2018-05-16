package co.com.valtica.kitbasico.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "asegurado")
public class Asegurado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDASEGURADO;
	private String NOMBRES;
	private String APELLIDOS;
	private int EDAD;
	private String TIPO_ASEGURADO;
	private String EMPRESA;
	private int SALARIO;
	private int CREDITOS;
	private int GASTOS_FIJOS;

	public Asegurado() {
	}

	public Asegurado(Long iDASEGURADO, String nOMBRES, String aPELLIDOS, int eDAD, String tIPO_ASEGURADO,
			String eMPRESA, int sALARIO, int cREDITOS, int gASTOS_FIJOS) {
		IDASEGURADO = iDASEGURADO;
		NOMBRES = nOMBRES;
		APELLIDOS = aPELLIDOS;
		EDAD = eDAD;
		TIPO_ASEGURADO = tIPO_ASEGURADO;
		EMPRESA = eMPRESA;
		SALARIO = sALARIO;
		CREDITOS = cREDITOS;
		GASTOS_FIJOS = gASTOS_FIJOS;
	}

	public Long getIDASEGURADO() {
		return IDASEGURADO;
	}

	public void setIDASEGURADO(Long iDASEGURADO) {
		IDASEGURADO = iDASEGURADO;
	}

	public String getNOMBRES() {
		return NOMBRES;
	}

	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}

	public String getAPELLIDOS() {
		return APELLIDOS;
	}

	public void setAPELLIDOS(String aPELLIDOS) {
		APELLIDOS = aPELLIDOS;
	}

	public int getEDAD() {
		return EDAD;
	}

	public void setEDAD(int eDAD) {
		EDAD = eDAD;
	}

	public String getTIPO_ASEGURADO() {
		return TIPO_ASEGURADO;
	}

	public void setTIPO_ASEGURADO(String tIPO_ASEGURADO) {
		TIPO_ASEGURADO = tIPO_ASEGURADO;
	}

	public String getEMPRESA() {
		return EMPRESA;
	}

	public void setEMPRESA(String eMPRESA) {
		EMPRESA = eMPRESA;
	}

	public int getSALARIO() {
		return SALARIO;
	}

	public void setSALARIO(int sALARIO) {
		SALARIO = sALARIO;
	}

	public int getCREDITOS() {
		return CREDITOS;
	}

	public void setCREDITOS(int cREDITOS) {
		CREDITOS = cREDITOS;
	}

	public int getGASTOS_FIJOS() {
		return GASTOS_FIJOS;
	}

	public void setGASTOS_FIJOS(int gASTOS_FIJOS) {
		GASTOS_FIJOS = gASTOS_FIJOS;
	}
	
	

}
