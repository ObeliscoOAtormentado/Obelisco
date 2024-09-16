public class Economy  extends Passagem{
    
    public Economy(String _cpf,String _nome, double _custoPassagem){
        super(_cpf, _nome, _custoPassagem);
    }

    public double custoBagagem(int qntdB, int []pesoB ){
        double papito=super.custoBagagem(qntdB, pesoB);
        if(papito<0){
            System.out.println("Há erro nso parametros informados");
            return papito;
        }
            return papito+qntdB*10;

    }
}

