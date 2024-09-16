public class Funcoes {
    public int f1(int n){
        int cont=0;
        for (int i=0; i < n; i++)
            for (int j=i; j < i+2; j++)
                for (int k=0; k < n; k++)
        cont++;
        return cont; 
        }  
    }
    

