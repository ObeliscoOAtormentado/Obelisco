public class Executive extends Passagem{
    public Executive(String _cpf, String _nome, double _custoPassagem) {
        super(_cpf, _nome, _custoPassagem);
    }
    @Override
    public double custoBagagem(int qntdB, int[] pesoB) {
        
        double custo= super.custoBagagem(qntdB, pesoB);
        if(custo<0){
            System.out.println("H[a erro ns parametros");
            return custo;
        }
        if(qntdB<=2){
            custo=0;
        }else{
        
        int desconto=0;
        for(int i=0;i<2;i++)
            desconto+=pesoB[i]*0.5;
            custo-=desconto;
        }
            setCustoDaBagagem(custo);
            return custo;
    }
    public int getMilhas(){
        return (int)(getCustoPassagem()*0.1);
    }
    @Override
    public String toString() {
        texto
        return super.toString();
        return texto
    }






}
