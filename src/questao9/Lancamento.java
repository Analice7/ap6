package questao9;

public class Lancamento extends Filme {
	private double ACRESCIMO = 3.00;

	public Lancamento(String titulo, String categoria) {
	    super(titulo, categoria);
	    this.calcularPreco();
	}

	public double getAcrescimo() {
	    return this.ACRESCIMO;
	}

	@Override
	public double calcularPreco() {
		if(this.getJaCalculouPreco()) {
			return this.getPreco();
		}
	    this.setPreco(this.getPreco() + this.getAcrescimo());
	    this.setJaCalculouPreco(true);
	    return this.getPreco();
	}
}
