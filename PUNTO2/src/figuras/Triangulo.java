package figuras;

public class Triangulo extends figuras{

   
    private int a=1;
    private int b=1;
    private int c=1;

    public void Triangulo(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangulo() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }    
    
    @Override
    public double perimetro(int a, int b, int c) {
        double per=a+b+c;
        return per;
    }

    @Override
    public double area(int a,int b, int c) {
        int s=((a+b+c)/2);
        double ar=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return ar;
    }
	
    
}