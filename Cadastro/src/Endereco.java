
public class Endereco  {
	String rua;
	int numero;
	String bairro;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return "Endereco: rua=" + rua + ", numero=" + numero + ", bairro=" + bairro ;
	}	

	public Endereco(String[] arrayLinha) {
		
		String[] arrayRua = arrayLinha[3].split("=");
		this.rua = arrayRua[1].trim();
		
		
	}

}
