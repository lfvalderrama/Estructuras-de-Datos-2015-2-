
package figuras;

public class Circulo extends figuras{

   
    private int a;
    
    public Circulo() {
        this.a = 1;
    }

    public void Circulo(int a) {
        this.a=a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    @Override
    public double perimetro(int a, int nada, int nada2) {
        double per=2*3.1416*a;
        return per;
    }

    @Override
    public double area(int a,int nada, int nada2) {
        double ar=3.1416*a*a;
        return ar;
    }

    
}