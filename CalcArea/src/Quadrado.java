
public class Quadrado implements AreaCalculavel{
	
	private int lado;
	
	// da um override para personalizar o metodo calcular area para o quadrado
	@Override
	public void calcularAreaQ() {
		System.out.println(lado*lado);
		
	}

	// método get e set para puxar e setar dados do quadrado
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}

	
		
}
