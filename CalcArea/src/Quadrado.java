
public class Quadrado implements AreaCalculavel{
	
	private int lado;
	

	@Override
	public void calcularAreaQ() {
		System.out.println(lado*lado);
		
	}


	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}

	
		
}
