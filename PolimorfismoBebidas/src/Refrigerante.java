
public class Refrigerante extends Bebida {

	public Refrigerante() {
		super("Refrigerante", false);
		
	}
	
	//cria o método preparar de Refrigerante
	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante");
	}
	
	
	
	
}
