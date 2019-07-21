package cap_01_funciones_objetos;

public class DosClases {
	public static void main(String[] args) {
		OtraClasse nuevo = new OtraClasse();
		nuevo.otromensajito();
	}
}

class OtraClasse {
	public void mensajito() {
		System.out.println("Yo soy un mensajito");
	}

	public void otromensajito() {
		System.out.println("Yo soy otro mensajito");
	}
}