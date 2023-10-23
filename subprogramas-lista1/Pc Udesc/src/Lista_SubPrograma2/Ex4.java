package Lista_SubPrograma2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
	static Scanner s = new Scanner(System.in);
	static double massaFinal = 0;
	
	public static void main(String[] args) {
		System.out.println("Cálculo de decaimento de material radioativo");
		System.out.println("Digite a massa(g) do seu material radioativo:");
		long massaInicial = s.nextLong();
		
		long seconds = calcula(massaInicial);
		String tempo = formataHMS(seconds);
		long quantidadeCiclo = seconds / 50;
		System.out.println("Massa inicial: " + massaInicial);
		System.out.println("Massa Final: "+ massaFinal);
		System.out.println("Tempo necesário: "+ tempo);
	}

	private static long calcula(long massaInicial){
		int quantidade = 0;
		double massa = massaInicial;
		
		while( massa >= 0.5) {
			quantidade += 1;
			massa = massa/(double)2;			
		}
		long tempoSegundos = quantidade * 50;	
		massaFinal = massa;
		return tempoSegundos;
	}
	
	private static String formataHMS(long seconds) {
		DecimalFormat dm = new DecimalFormat("00");
		long hora 	= seconds 	/ 3600;
		long sec	= seconds 	% 3600;
		long min 	= sec 		/ 60;
		sec	= seconds 	% 60;
		return dm.format(hora) + ":" + dm.format(min)+ ":" + dm.format(sec);
		
	}
}
