package questao9;

public class Infantil extends Filme {
	private double ACRESCIMO = 2.00;

	public Infantil(String titulo, String categoria) {
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
