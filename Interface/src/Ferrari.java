
 // quando herança coloca extend; interfaces usam implement
public class Ferrari implements Automovel, ItemCaro {
	
	//subscreve os métodos de Automovel e implementa comandos para Ferrari
	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}
	
	//subscreve getPreco de ItemCaro e retorna o valor de 25000
	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 25000;
	}
	
	
}
