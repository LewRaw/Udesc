package Lista_SubPrograma;
import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class Ex1 {
	
	public static double calculaVolume(double raio) { 
		return 4/3 * Math.PI * Math.pow(raio, 3); 
	}
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner s = new Scanner(System.in);
		System.out.println("Escreva o Raio de uma esfera");
		double raio = s.nextDouble();
		System.out.println("O volume da esfera e de: "+ df.format(calculaVolume(raio)));
		
	}

}
