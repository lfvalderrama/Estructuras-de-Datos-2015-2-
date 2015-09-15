
package figuras;

public class Rectangulo extends figuras{
    private int a=1;
    private int b=1;
    
    public Rectangulo() {
        this.a = 1;
        this.b = 1;
    }

    public void Rectangulo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    
    @Override
    public double perimetro(int a, int b, int nada) {
       double per=((2*a)+(2*b));
       return per;
    }

    @Override
    public double area(int a, int b, int nada) {
    double ar=(a*b);
    return ar;
    }
    
}