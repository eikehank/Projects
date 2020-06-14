package GNC;

public class cinema {

	static String rua, numero, bairro;
	
	public static String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public static String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public static String saida() {
		return "O cinema possui sáidas de emergência";
	}
}
