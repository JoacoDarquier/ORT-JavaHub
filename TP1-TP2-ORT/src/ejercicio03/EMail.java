package ejercicio03;

public class EMail {

	private String cuenta;
	private String dominio;
	
	
	public EMail(String cuenta, String dominio) {
		this.cuenta = cuenta;
		this.dominio = dominio;
	}


	public void getValor () {
		System.out.println(getCuenta() + "@" + (getDominio()) + ".com");
	}
	
	
	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public String getDominio() {
		return dominio;
	}


	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	
	
	
	
	
}
