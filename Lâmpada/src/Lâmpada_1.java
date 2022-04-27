
public class Lâmpada_1 {

		private boolean lamp; 
		
		
			
			
		
		
		public void apagar () {
			lamp = false;
			
			
			
		}
		public void ascender () {
			lamp = true;
			
			
	}
		
		public void imprimir () {
			if(lamp==true) {
				System.out.println("lâmpada ligada");
			}
				else {
					System.out.println("lâmpada apagada");
				}
			}
		}


