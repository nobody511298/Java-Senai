
public class Quadrado implements AreaCalculavel{
	
	private int lado = 2;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public void calcularAreaQ() {
		System.out.println(lado*lado);
		
	}

	
		
}
