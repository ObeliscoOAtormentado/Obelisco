public class Aluno {
    private int matricula;
    private int dataDeNascimento;
    private String nome;

    public Aluno(int matricula, int dataDeNascimento, String nome){
        this.matricula=matricula;
        this.dataDeNascimento= dataDeNascimento;
        this.nome= nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getDataDeNascimento(){
        return dataDeNascimento;
    }
    public String getNome(){
        return nome;
    }
}


