import java.io.IOException;
import java.util.Scanner;
public class questao002 {
	public static void main(String[] args)throws IOException {
		char escala;
		Scanner tecla = new Scanner(System.in);
		System.out.println("digite o grau:");
		double grau = tecla.nextInt();
		System.out.println("coloque a escala de temperatura entre C-Celsius,F-Fahrenheit,K-Kelvin");
		escala =(char)System.in.read();
		if((escala =='C') || (escala == 'c')){
			System.out.println("O grau de celso continua sendo:"+grau);
			double kelvin = grau + 273.15;
			System.out.println("A conversão de Celsius para kelvin é:"+kelvin);
			double fahrenheit = grau + 32;
			System.out.println("A conversão de Celsius para Fahreinheit é:"+fahrenheit);	
		}else if((escala =='f') || (escala == 'F')){
			System.out.println("O grau de Fahrenheit continua sendo:"+grau);
			double kelvin = (grau + 459.67)*5 /9;
			System.out.println("A conversão de Fahreinheit para kelvin é:"+kelvin);
			double celsius = (grau - 32)*5/9;
			System.out.println("A conversão de Fahreinheit para Celsius é:"+celsius);	
		}else if((escala =='K') || (escala == 'k')){
			System.out.println("O grau de kelvin continua sendo:"+grau);
			double fahrenheit = (grau - 273.15)*9/5;
			System.out.println("A conversão de kelvin para Fahrenheit é:"+fahrenheit);
			double celsius = (grau - 273.15);
			System.out.println("A conversão de Kelvin para Celsius é:"+celsius);	
		}else {
			System.out.println("codigo invalido");
		}
	}
}
