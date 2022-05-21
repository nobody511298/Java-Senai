
public class Preparador {
	public void prepararBebida(Bebida bebida) {
		
		//imprime o texto dentro de Syso, que contém uma frase fixa e chama o nome da bebida que sera preparada
		System.out.println("Preparando a bebida " + bebida.getNome());
		System.out.println("Pegando o copo");
			
		
			bebida.preparar();
					
				if(bebida.isAquecer()) {
					System.out.println("Aquecendo a bebida " + bebida.getNome());	
				}
				System.out.println("Bebida preparada com sucesso!!");
	}
	
}
