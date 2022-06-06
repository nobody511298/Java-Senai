
public class Retangulo implements AreaCalculavel {

	private int l;
	private int h;
	
	// esta classe tema mesma lógica da classe quadrado
	@Override
	public void calcularAreaQ() {
		System.out.println(l*h);
		
		
	}


	public int getL() {
		return l;
	}


	public void setL(int l) {
		this.l = l;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}
	
	
	
}
