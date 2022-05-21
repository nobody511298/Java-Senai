
public class Aplicacao {

	public static void main(String[] args) {
		
		//estancia objetos para as diversas classes
		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
		//chama o metodo prepararbebida de leite quente
		preparador.prepararBebida(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();
		//chama o metodo prepararbebida de refrigerante
		preparador.prepararBebida(refrigerante);
		
	}

}
