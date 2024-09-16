public class Retangulo extends FiguraBidimensional{
    private int altura;
    private int base;


    public Retangulo(int centrox, int centroy, int base, int altura){
        super(centrox,centroy);
        this.base= base;
        this.altura=altura;
    }
    public double area(){
        return base*altura;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
}