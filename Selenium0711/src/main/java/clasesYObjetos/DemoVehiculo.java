package clasesYObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {

		//nombre de la clase; instancia ; nueva clase
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//Asignar los valores
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");

	}

}
