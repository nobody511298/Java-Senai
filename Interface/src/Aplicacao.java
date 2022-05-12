
public class Aplicacao {

	public static void main(String[] args) {
		Rota rota = new Rota ();
		Ferrari ferrari = new Ferrari();
		Fusca fusca = new Fusca();
		rota.ir(ferrari);
		System.out.println();
		rota.ir(fusca);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
