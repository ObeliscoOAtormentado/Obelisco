public class Circulo{
    private int x, y, raio;
    private final 
    public Circulo(int x, int y, int r){
        if(x<0)
            this.x=0;
        else
            this.x=x;
            
        this.y=(y<0)?0:r;
            
        this.raio=(r<0)?0:r;
    }
    public void setX(int x){
        if(x>=0) this.x=x;

    }
    public void setY(int y){
        if(y>=0) this.y=y;
    }
    public void setPosition(int x, int y){
        if(x>=0) this.x=x;
        if(y>=0) this.y=y;
    }
    public double area(){
        double areaDoCirculo = Math.PI*this.raio*this.raio;
        return areaDoCirculo;
    }
    public double circunferencia(){
        double circunferencia = 2*Math.PI*this.raio;
        return circunferencia;
    }
    public static void main(String[]args){
        Circulo c= new Circulo(1,2,3);
        System.out.println();
    }
}