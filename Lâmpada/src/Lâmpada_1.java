
public class Lâmpada_1 {
		//cria uma booleana privada intitulada lamp
		private boolean lamp; 
		
		//cria um metodo onde a condição da lampada se torna falsa
		public void apagar () {
			lamp = false;
			
			
			
		}
		//cria um metodo onde a condição da lampada se torna verdadeira
		public void ascender () {
			lamp = true;
			
			
	}
		//cria um metodo onde existem duas condições, onde se uma for verdadeira imprime uma informação no monitor, caso
		//contrário imprime outra
		public void imprimir () {
			if(lamp==true) {
				System.out.println("lâmpada ligada");
			}
				else {
					System.out.println("lâmpada apagada");
				}
			}
		}


