
public class L�mpada_1 {
		//cria uma booleana privada intitulada lamp
		private boolean lamp; 
		
		//cria um metodo onde a condi��o da lampada se torna falsa
		public void apagar () {
			lamp = false;
			
			
			
		}
		//cria um metodo onde a condi��o da lampada se torna verdadeira
		public void ascender () {
			lamp = true;
			
			
	}
		//cria um metodo onde existem duas condi��es, onde se uma for verdadeira imprime uma informa��o no monitor, caso
		//contr�rio imprime outra
		public void imprimir () {
			if(lamp==true) {
				System.out.println("l�mpada ligada");
			}
				else {
					System.out.println("l�mpada apagada");
				}
			}
		}


