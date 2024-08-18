package questao13;

public class Corredor extends Atleta implements ICorredor {
		
	public Corredor(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void correr() {
        System.out.println(getNome() + " esta correndo.");
    }

}
