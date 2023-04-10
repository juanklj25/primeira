import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class questao003 {
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		System.out.println("coloque seu nome e sobrenome:");
		String pai = tecla.nextLine();
	String nome2 = "wayne";
	String nome3 = "kent";
	String nome4 = "diana";
	if ((pai.toLowerCase().contains(nome2.toLowerCase()))) {
	    System.out.println("Acesso liberado, Sr.Wayne");
	} else if((pai.toLowerCase().contains(nome3.toLowerCase()))){
	    System.out.println("Saí daí,mane");
	}else if((pai.toLowerCase().contains(nome4.toLowerCase()))){
	    System.out.println("Bem-vinda Princesa de Themyscara");
}	else {
	System.out.println("Cai fora");
}
}
}
