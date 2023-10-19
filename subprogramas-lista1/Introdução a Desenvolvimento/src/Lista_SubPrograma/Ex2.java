package Lista_SubPrograma;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
	
	public static double calculaMedia(double n1, double n2, double n3, String operacao){
		double mediaCalculada = 0.00;
		if (operacao.equalsIgnoreCase("A")){
			mediaCalculada = n1 + n2 + n3 /3;
		}else{
			double p1 = 5;
			double p2 = 3;
			double p3 = 2;
			mediaCalculada = n1 * p1 + n2 * p2 + n3 * p3 / p1 + p2 + p3;
		}

		return mediaCalculada;
	}
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner s = new Scanner(System.in);

		System.out.println("Deseja prosseguir? 'S' para continuar e 'X' para cancelar");
		String escolha = s.next();
		
		while (escolha.equalsIgnoreCase("S")){
			
			System.out.println("Informe a nota 1");
			double n1 = s.nextDouble();

			System.out.println("Informe a nota 2");
			double n2 = s.nextDouble();

			System.out.println("Informe a nota 3");
			double n3 = s.nextDouble();

			System.out.println("Para calcular a média Aritmética informe 'A' e para ponderada (pesos 5,3,2) informe 'P'");
			String operacao = s.next();

			double media = calculaMedia(n1, n2, n3, operacao);

			System.out.println("A média é: "+ df.format(media));

			System.out.println("Deseja prosseguir? 'S' para continuar e 'X' para cancelar");
		 	escolha = s.nextLine();
		}

	}

}
