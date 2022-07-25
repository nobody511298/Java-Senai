
public class Re implements Formula{

private int temp;


	
	public int getTemp() {
	return temp;
}



public void setTemp(int temp) {
	this.temp = temp;
}


	@Override
	public void calcularT() {
		// TODO Auto-generated method stub
		System.out.println(temp * 0.8);
	}
}


