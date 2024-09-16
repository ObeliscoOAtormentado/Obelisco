

public class App {
    public static void main(String[] args) {
        Funcoes f=new Funcoes();
        for(int i=1;i<900;i+=50){
            int r=f.f1(i);
            System.out.println(i+";"+r);
        }
    }
}
