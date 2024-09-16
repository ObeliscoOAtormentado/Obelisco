public class App {
    public void main(String[]args){
        Passagem pn=new Passagem("001.002.003-04", "Ednaldo Pereira", 0);
        System.out.println(pn);
        
        pn.defineAssento("24N");
        System.out.println(pn);

        pn.custoBagagem(3, new int[]{15, 20, 32});
        System.out.println(pn);
        System.out.println("-=-=-=-=-");
    }
    
}
