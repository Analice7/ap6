package questao10;

public class Promocao implements ICategoria{
	
	private final double DESCONTO = 2.00;

    @Override
    public double aplicarCategoria(double precoBase) {
        return precoBase - this.DESCONTO;
    }
    
}
