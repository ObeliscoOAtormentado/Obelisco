public class Passagem{
    private String nome,cpf,assento;
    private double custoPassagem;
    
    public Passagem(String _cpf, String _nome, double _custoPassagem){
        this.cpf=_cpf;
        this.nome=_nome;
        this.custoPassagem=_custoPassagem;
    }
    public double custoBagagem(int qntdB, int []pesoB ){
        if((qntdB<1)||(pesoB==null)||(qntdB!=pesoB.length))
            return -1;
        for(int peso: pesoB)
            if(peso<=0) return -1;
        int pesoTotal=0;
        for(int peso:pesoB)
            pesoTotal+=peso;
        return pesoTotal*0.5;
        
        
    }
        public double defineAssento(String _assento){
            this.assento=_assento;
            if(this.assento!=null)return 5;
            else return 0;
        }
        public String toString(){
            StringBuilder st=new StringBuilder();
            st.append("Datalhes sobre passagem");
            st.append("Nome "+ this.nome);
            st.append("Custo passagem"+this.custoPassagem); 
            st.append("Assento"+ this.assento);
            st.append("Cpf"+this.cpf);
            return st.toString();
        }
        protected void setCustoDaBagagem(_custoPassagem){
            
        }






}