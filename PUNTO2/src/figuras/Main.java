package figuras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int p,aux,a,b,c,aux2=0;
		double P[][] = new double [3][5];
		double A[][] = new double [3][5];
		
		System.out.println("Para crear un rectangulo por defecto ingrese 0");
		while(aux2<3){
			p=0;
			aux=0;
			a=1;
			b=1;
			c=1;
		while (aux<5){
			Circulo fig1 = new Circulo();
			Rectangulo fig2 = new Rectangulo();
			Triangulo fig3 = new Triangulo();
			if(aux2==0){
				System.out.println("Circulo "+(aux+1)); 				
				a= scan.nextInt();
			}
			if(aux2==1){
				System.out.println("Rectangulo "+(aux+1)); 
				a= scan.nextInt();
				b= scan.nextInt();
			}
			if(aux2==2){
				System.out.println("Triangulo "+(aux+1));
				a= scan.nextInt();
				b= scan.nextInt();
				c= scan.nextInt();
			}			
			if(a==0){
				if(p==1){
					System.out.println("No se puede crear mas de un rectangulo por defecto");
				}
				p=1;
			}
			else{
				while(a < 1){
					a = scan.nextInt();
				}
				fig1.Circulo(a);
				if(aux2>=1){
					b=scan.nextInt(); 
					while(b < 1){
						c = scan.nextInt();
					}
					fig2.Rectangulo(a,b);
				}
				if(aux2>=2){
					c=scan.nextInt(); 
					while(c < 1){
						c = scan.nextInt();
					}
					fig3.Triangulo(a,b,c);
				}
			}
			if(a==0){
				a=1;
				b=1;
				c=1;
			}
			else{
			if(aux2==0){
				P[0][aux]= fig1.perimetro(a, 0, 0);
				A[0][aux]= fig1.area(a, 0, 0);
				System.out.println("Area: "+fig1.area(a, 0, 0));				
				System.out.println("Perimetro: "+fig1.perimetro(a, 0, 0));
				
			}
			if(aux2==1){
				P[1][aux]= fig2.perimetro(a,b, 0);
				A[1][aux]= fig2.area(a, b, 0);
				System.out.println("Area: "+fig2.area(a,b, 0));
				System.out.println("Perimetro: "+fig2.perimetro(a,b, 0));
				
			}
			if(aux2==2){
				P[2][aux]= fig3.perimetro(a,b, c);
				A[2][aux]= fig3.area(a, b, c);
				System.out.println("Area: "+fig3.area(a,b,c));
				System.out.println("Perimetro: "+fig3.perimetro(a,b,c));				
			}	
			}
			aux++;
		}
		aux2++;
		}
		for(int i=0; i <15; i ++){
			if(i<5) System.out.print("Circulo "+((i%5)+1)+":  "); 	
			if(i>=5&&i<10) System.out.print("Rectangulo "+((i%5)+1)+":  "); 
			if(i>=10) System.out.print("Triangulo "+((i%5)+1)+":  "); 
			System.out.print("Perimetro: "+P[i/3][i%5]+"  "); 
			System.out.print("Area: "+A[i/3][i%5]); 
			System.out.println(); 
		}
		
			
			
		}
	}
