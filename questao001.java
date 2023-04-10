import java.util.Scanner;
import java.io.IOException;
public class questao001 {
	public static void main(String[] args)throws IOException  {
	int numero1,numero2,numero;
	char simbolos;
	System.out.println("coloque o simbolo para soma_+,subtração_-,divisão_/,multiplicação_*,potenciação_&,raiz_%:");
	Scanner simbolo = new Scanner(System.in);
	simbolos =(char)System.in.read();
	if(simbolos == '+'){
		System.out.println("coloque o primeiro numero:");
		Scanner tecla = new Scanner(System.in);
		numero1 = tecla.nextInt();
		System.out.println("coloque o segundo numero:");
		Scanner pis = new Scanner(System.in);
		numero2 = pis.nextInt();
		numero = numero1 +numero2;
		System.out.print("Oresultado é"+numero);
	}else if(simbolos == '-') {
		System.out.println("coloque o primeiro numero:");
		Scanner tecla = new Scanner(System.in);
		numero1 = tecla.nextInt();
		System.out.println("coloque o segundo numero:");
		Scanner pis = new Scanner(System.in);
		numero2 = pis.nextInt();
		numero = numero1 -numero2;
		System.out.print("O resultado é"+numero);
	}else if(simbolos == '*') {
		System.out.println("coloque o primeiro numero:");
		Scanner tecla = new Scanner(System.in);
		numero1 = tecla.nextInt();
		System.out.println("coloque o segundo numero:");
		Scanner pis = new Scanner(System.in);
		numero2 = pis.nextInt();
		numero = numero1 * numero2;
		System.out.println("O resultado é:" +numero);
	}else if(simbolos == '/') {
		System.out.println("coloque o primeiro numero:");
		Scanner tecla = new Scanner(System.in);
		numero1 = tecla.nextInt();
		System.out.println("coloque o segundo numero:");
		Scanner pis = new Scanner(System.in);
		numero2 = pis.nextInt();
		numero = numero1 / numero2;
		System.out.println("O resultado é:" +numero);
	}else if(simbolos == '&') {
		double base,expoente,porcentagem;
		System.out.println("coloque o numero para fazer a porcentenciação:");
		Scanner tecla = new Scanner(System.in);
		base = tecla.nextDouble();
		System.out.println("coloque quantas vezes vai potencializar:");
		Scanner pis = new Scanner(System.in);
		expoente = pis.nextDouble();
		porcentagem = Math.pow(base, expoente);
		System.out.print(porcentagem);
	}else if(simbolos == '%') {
		double raizquadrada,raizcubica,raiz;
		System.out.println("coloque o numero para fazer a raiz quadrada e cubica:");
		Scanner tecla = new Scanner(System.in);
		raiz = tecla.nextDouble();
		raizquadrada = Math.sqrt(raiz);
		System.out.println("raiz quadrada:"+raizquadrada);
		raizcubica = Math.cbrt(raiz);
		System.out.println("A raiz quadrada é"+raizcubica);
	}
}
}