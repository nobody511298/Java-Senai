
public class Preparador {
	public void prepararBebida(Bebida bebida) {
		
		//imprime o texto dentro de Syso, que cont?m uma frase fixa e chama o nome da bebida que sera preparada
		System.out.println("Preparando a bebida " + bebida.getNome());
		System.out.println("Pegando o copo");
			
			//chama o m?todo preparar de bebida
			bebida.preparar();
					
				//se a condi??o booleana aquecer for verdadeira, a aplica??o executa o comando abaixo, imprimindo no console
				if(bebida.isAquecer()) {
					System.out.println("Aquecendo a bebida " + bebida.getNome());	
				}
				System.out.println("Bebida preparada com sucesso!!");
	}
	
}
