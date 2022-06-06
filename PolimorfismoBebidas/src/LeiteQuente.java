
public class LeiteQuente extends Bebida {
	public LeiteQuente() {
		//indica leite quente como verdadeiro na condição de aquecer
		super("Leite Quente", true);
}
	//cria o metodo preparar de leite quente
	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		super.preparar();
		System.out.println("Colocando leite no copo");
	
	}
}
