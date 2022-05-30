public class Mouse {
	
	
	
	private boolean funciona;
	private int qtdBotoes;
	private String tamanho;
	
	
	
	// constroe um novo mouse na memoria com tres atributos, for�ando a escrever os tres atributos quando criar um novo mouse da classe mouse
	
	
	
	
	//m�todos get e set para setar e pegar valores dos atributos
	
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(int qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	//to string serve para converter para string as informa��es ao inves de printar o endere�o na mem�ria
	
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "]" + "\n";
	}
	
	
}