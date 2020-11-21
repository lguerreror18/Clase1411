package herencia;

public class Triangulo extends DosDimensiones{

	//1. Declarar las variables
	String estilo;
	
	//2. Crear dos métodos
	
	double area () {
	return base * altura /2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
		
	}

}
