/**
 * Moeda
 */
public class Moeda {

    private double valor;
    private String nome;

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

    public Moeda(String nome, double valor){
        this.nome=nome;
        this.valor=valor;
    }
}