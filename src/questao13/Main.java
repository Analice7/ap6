package questao13;

public class Main {
    public static void main(String[] args) {
        Corredor corredor = new Corredor("João", 25);
        Nadador nadador = new Nadador("Maria", 23);
        Ciclista ciclista = new Ciclista("Pedro", 30);
        Triatleta triatleta = new Triatleta("Ana", 28);

        corredor.aquecer();
        corredor.correr();
        
        nadador.aquecer();
        nadador.nadar();
        
        ciclista.aquecer();
        ciclista.pedalar();
        
        triatleta.aquecer();
        triatleta.correr();
        triatleta.nadar();
        triatleta.pedalar();
    }
}
