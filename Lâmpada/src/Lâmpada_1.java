
public class L�mpada_1 {

		private boolean lamp; 
		
		
			
			
		
		
		public void apagar () {
			lamp = false;
			
			
			
		}
		public void ascender () {
			lamp = true;
			
			
	}
		
		public void imprimir () {
			if(lamp==true) {
				System.out.println("l�mpada ligada");
			}
				else {
					System.out.println("l�mpada apagada");
				}
			}
		}


