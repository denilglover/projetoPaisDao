package figurasGeometricas;

public class Retangulo extends Poligono implements Diagonal {
	
	public Retangulo(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double diagonal() {
		double d = Math.sqrt(Math.pow(getAltura(),2)+Math.pow(getBase(),2));
		return d; 
	}

	@Override
	public double perimetro() {
		
		return (getBase()*2)+getAltura()*2;
	}

	@Override
	public double area() {
		
		return getBase()*getAltura();
	}

	
	

}
