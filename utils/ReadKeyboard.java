import java.util.*;

public class ReadKeyboard {
	/**
	 * Para a execução do código aguardando que o usuário digite uma string e pressione enter
	 * @return texto lido pelo teclado
	 */
	public static String readString()
	{
		Scanner keyboardRead = new Scanner( System.in );
		String text = keyboardRead.nextLine();
		return text; 
	}
	
	/**
	 * Para a execução do código aguardando o usuário digitar um inteiro e pressionar enter
	 * @return
	 */
	public static int readInteger()
	{
		Scanner keyboardRead = new Scanner( System.in );   
		int value = keyboardRead.nextInt(); 
		return value;
	}
}