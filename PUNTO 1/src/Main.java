import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int aux=0,an=0,lar=0,a=0;
		System.out.println("Para crear un rectangulo por defecto ingrese 0");
		while (aux<5){
			System.out.println("Rectangulo "+(aux+1));
			Rectangulo rect1= new Rectangulo();
			an= scan.nextInt();
			if(an==0){ 
				if(a==1){
					System.out.println("No se puede crear mas de un rectangulo por defecto");
				}
				a=1;
			}
			else{
				if(an < 1 || an >20){
					an= scan.nextInt();
				}
				lar=scan.nextInt(); 
				if(lar < 1 || lar >20){
					lar= scan.nextInt();
				}
				rect1.cambio_ancho(an);
				rect1.cambio_largo(lar);
			}
			System.out.println("Area: "+rect1.area());
			System.out.println("Perimetro: "+rect1.perimetro());
			aux++;
		}
	}
}