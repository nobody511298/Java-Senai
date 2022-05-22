
public class Aplicacao {

	public static void main(String[] args) {
		
		//estancia novo objeto de Rota
		
		Rota rota = new Rota ();
		
		//estancia novo objeto de Ferrari
		
		Ferrari ferrari = new Ferrari();
		
		//estancia novo objeto de Fusca
		
		Fusca fusca = new Fusca();
		
		//chama o metodo ir de rota para o objeto ferrari
		
		rota.ir(ferrari);
		System.out.println();
		
		//chama o metodo ir de rota para o objeto fusca
		
		rota.ir(fusca);
		
		//estancia novo objeto de Vendedor e Apartamento
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		//chama o metodo mostrar preço de vendedor para os objetos apartamento e ferrari
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
