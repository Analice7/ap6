package questao10;

import java.util.ArrayList;

public class Filme{
	
	  private String titulo;
	  private double precoBase = 4.00;
	  private ArrayList<ICategoria> categorias = new ArrayList<>();

	  public Filme(String titulo) {
	        this.titulo = titulo;
	  }

	  public String getTitulo() {
	        return this.titulo;
	  }

	  public double getPrecoBase() {
	        return this.precoBase;
	  }
	  
	  public String getCategorias() {
	        StringBuilder categoriasStr = new StringBuilder();
	        for (ICategoria categoria : categorias) {
	            categoriasStr.append(categoria.getClass().getSimpleName()).append(" ");
	        }
	        return categoriasStr.toString().trim();
	  }

	  public void adicionarCategoria(ICategoria categoria) {
	        this.categorias.add(categoria);
	  }

	  public double calcularPreco() {
	        double precoFinal = this.precoBase;
	        for (ICategoria categoria : categorias) {
	        	precoFinal = categoria.aplicarCategoria(precoFinal);
	        }
	        return precoFinal;
	  }

}
