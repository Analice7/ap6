package questao9;

public class Promocao extends Filme {
	private double DESCONTO = 2.00;

	public Promocao(String titulo, String categoria) {
	    super(titulo, categoria);
	    this.calcularPreco();
	}

	public double getDesconto() {
	    return this.DESCONTO;
	}

	@Override
	public double calcularPreco() {
		if(this.getJaCalculouPreco()) {
			return this.getPreco();
		}
	    this.setPreco(this.getPreco() - this.getDesconto());
	    this.setJaCalculouPreco(true);
	    return this.getPreco();
	}
}
