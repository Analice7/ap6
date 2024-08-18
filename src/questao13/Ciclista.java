package questao13;

public class Ciclista extends Atleta implements ICiclista{
	
	public Ciclista(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void pedalar() {
        System.out.println(getNome() + " esta pedalando.");
    }

}
