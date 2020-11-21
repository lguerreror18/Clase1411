package arreglos;

public class ArreglosEj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];  //le colocas el tipo de variable, en este caso intArrat
		int [] intArray2;
		
		short shorArray[];
		String array[]; //declaración de array
		
		array = new String[5]; //Asignando memoria para 5 Strings, son 5 espacios y empieza en 0
		
		array[0] = "Cero";
		array[1] = "Uno";
		array[2] = "Dos";
		array[3] = "Tres";
		array[4] = "Cuatro";
		
//		System.out.println("Elemento en la posición 1: " + array[1]);
		
//		System.out.println("Elemento en la posición 3: " + array[3]);
		
		for(int i=0; i < array.length; i++) { //0 porque es la posion incial / array.length calcula la longitud del arreglo
			
			System.out.println("Elemento en el indice " + i + ": " + array[i]);
		} 
		
		int[] intArregloDinamico = new int[] {1,2,3,4,3,4,12}; // Arreglo dinamico, no especificas memoria
	}

}
