
public class Cliente extends Usuario  {
	
	
	
	public Cliente(String nome, int cpf, double valorPagarServico, Servico servico, FormaPag formapag) {
		super(nome, cpf);
		this.valorPagarServico = valorPagarServico;
		this.servico = servico;
		this.formapag = formapag;
	}
	private double valorPagarServico;
	private Servico servico;
	private FormaPag formapag;
	
	public double getValorPagarServico() {
		
		return (servico.getQtdHorasServico() * servico.getValorHoraServico());

	}
	public void setValorPagarServico(double valorPagarServico) {
		this.valorPagarServico = valorPagarServico;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public FormaPag getFormapag() {
		return formapag;
	}
	public void setFormapag(FormaPag formapag) {
		this.formapag = formapag;
	}
	
	@Override
	public String toString() {
		return "Cliente valorPagarServico= " + valorPagarServico + ", servico= " + servico + ", formapag= " + formapag
				+ "\n";
	}
	
	
	
	

}
