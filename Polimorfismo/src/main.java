
public class main {

	public static void main(String[] args) {
//		Animal animal = new Cachorro();
//		animal.Falar();
//		
//		animal = new Gato();
//		animal.Falar();
		
		Gato gato=new Gato(); //estancia objeto
		Cachorro cachorro=new Cachorro();//estancia objeto
		falar(gato); //chama o m�todo falar do gato
		falar(cachorro);//chama o m�todo falar do cahorro
		falar(cachorro);//chama o m�todo falar do cahorro
		falar(cachorro);//chama o m�todo falar do cahorro
		falar(gato);//chama o m�todo falar do gato
		
	}
	public static void falar(Animal a) { //cria variavel 'a' para Animal
		a.Falar();//chama o metodo referente a classe animal 
		
		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}
}