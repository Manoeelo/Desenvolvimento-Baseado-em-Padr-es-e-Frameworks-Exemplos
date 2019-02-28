
public class ReadKeyboardExample {

	public static void main(String[] args) {
		System.out.println("Digite um inteiro e pressione enter:\n");
		int i = ReadKeyboard.readInteger();
		System.out.println("Inteiro digitado: " + i);
		
		System.out.println("Digite um texto e pressione enter:\n");
		String s  = ReadKeyboard.readString();
		System.out.println("Texto digitado: " + s);

	}

}
