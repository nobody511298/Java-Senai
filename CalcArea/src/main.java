
public class main {

	public void main(String[] args) {
		
		
		//estancia novo objeto, seta valores e chama o método para calcular a area do retangulo
		
		Retangulo retangulo = new Retangulo();
		retangulo.setL(5);
		retangulo.setH(5);
		retangulo.calcularAreaQ();
		
		//estancia novo objeto, seta valores e chama o método para calcular a area do Quadrado
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(5);
		quadrado.calcularAreaQ();
		System.out.println("calcularArea");
	
}}
