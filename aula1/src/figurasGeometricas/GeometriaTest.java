package figurasGeometricas;


import java.util.ArrayList;

public class GeometriaTest {
	public static void main(String[] args) {
		ArrayList<figura> f1 = new ArrayList<>();
		f1.add(new Quadrado(4,4));
		f1.add(new Retangulo(3,4));
		f1.add(new Losango(5,4));
		
		for(figura f1:figuras){ 
			System.out.println(f1.area());    
		} 
	}
}
