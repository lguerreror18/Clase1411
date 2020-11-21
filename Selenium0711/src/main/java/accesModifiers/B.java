package accesModifiers;

public class B {

	public static void main(String[] args) {
		//1. instanciar
		A a = new A();
		
		a.mostrarpublic();
		
		//a.mostrar(); //se verifica que no se puede acceder a este metodo porque no es publico
		

	}

}
