
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
		return "Rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + "\n" ;
	}	

	public Endereco(String[] arrayLinha) {
		
		//rua � do tipo String, ent�o � criado uma matriz tipo String, � indicado a posi��o que a informa��o est� e o split serve para quebrar o texto para
		//melhor localiza��o da informa��o
		String[] arrayRua = arrayLinha[3].split("=");
		//this rua = array rua, indica que a informa��o dentro de this.rua vai ser a informa��o inserida dentro de arrayRua, e o trim serve para excluir os 
		//espa�os
		this.rua = arrayRua[1].trim();

		String[] arrayBairro = arrayLinha[5].split("=");
		this.bairro = arrayBairro[1].trim();
		
		String[] arrayNumero = arrayLinha[4].split("=");
		//integer parseint serve para converter int para String
		this.numero = Integer.parseInt(arrayNumero[1].trim());
		
		
		
		
	}
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

}
