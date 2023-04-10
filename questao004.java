import java.util.Scanner;
public class questao004 {
	public static void main(String[] args) {
	double numero;
	Scanner tecla = new Scanner(System.in);
	System.out.println("digite o numero:");
	numero = tecla.nextDouble();
	if(numero %2 == 0) {
		numero = Math.sqrt(numero);
		System.out.println(numero);
		}else if(numero %2 == 1) {
			numero = Math.cbrt(numero);
			System.out.println(numero);
	}
}
}
