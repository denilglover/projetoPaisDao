package figurasGeometricas;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double diagonal() {
		 double d=getAltura()*Math.sqrt(2);
		return d;
	}

	@Override
	public double perimetro() {
		
		return getBase()*4;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(getAltura(), 2);
	}

	
	
	
}
