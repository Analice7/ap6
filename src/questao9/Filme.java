package questao9;

public abstract class Filme {
	private String titulo;
	private String categoria;
	private double preco;
	private boolean jaCalculouPreco;

	public Filme(String titulo, String categoria) {
	    this.titulo = titulo;
	    this.categoria = categoria;
	    this.preco = 4.00;
	    this.jaCalculouPreco = false;
	}

	public String getTitulo() {
	    return this.titulo;
	}

	public String getCategoria() {
	    return this.categoria;
	}

	public double getPreco() {
	    return this.preco;
	}
	
	public boolean getJaCalculouPreco() {
		return this.jaCalculouPreco;
	}

	public void setPreco(double preco) {
	    this.preco = preco;
	}
	
	public void setJaCalculouPreco(boolean valor) {
		this.jaCalculouPreco = valor;
	}

	public abstract double calcularPreco();

}
