package figurasGeometricas;

public abstract class Poligono extends figura{
	private double base;
	private double altura;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	@Override
	public abstract double area(); 
		

	
	public abstract  double perimetro() ;
		
	
}
