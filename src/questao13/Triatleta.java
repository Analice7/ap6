package questao13;

public class Triatleta extends Atleta implements ICiclista, ICorredor, INadador {
	 public Triatleta(String nome, int idade) {
	        super(nome, idade);
	    }

	    @Override
	    public void correr() {
	        System.out.println(getNome() + " esta correndo.");
	    }

	    @Override
	    public void nadar() {
	        System.out.println(getNome() + " esta nadando.");
	    }

	    @Override
	    public void pedalar() {
	        System.out.println(getNome() + " esta pedalando.");
	    }
}