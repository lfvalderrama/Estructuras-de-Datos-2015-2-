public class Rectangulo {
	public Rectangulo(int w, int h) {
        ancho=w;
        largo=h;
    }
	public Rectangulo() {
        ancho=1;
        largo=1;
    }
	public void entrada_ancho(int an){
		ancho=an;
	}
	public void  entrada_largo(int lar){
		largo=lar;
	}
	public int area() {
		return (ancho*largo);
	}
	public int perimetro() {
		return (ancho*2+largo*2);
	}
	private int ancho=1;
	private int largo=1;
	public void cambio_ancho(int a){
		ancho = a;		
	}
	public void cambio_largo(int a){
		largo = a;		
	}
}