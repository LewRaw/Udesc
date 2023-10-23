package Lista_SubPrograma2;

import java.util.Scanner;

public class ex5 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int q10 = 0, q15 = 0,q20 = 0,q25 = 0, naoCabe = 0;;
		
		System.out.println("Deseja informar um lote? S/N");
		String opcao = s.nextLine();
		
		while(opcao.equalsIgnoreCase("s")) {
			System.out.println("Quantidade de brinquedos:");
			int quantidadeBrinquedos = s.nextInt();
			System.out.println("Informe o lado a");
			double a = s.nextDouble();
			System.out.println("Informe o lado b");
			double b = s.nextDouble();
			System.out.println("Informe o lado c");
			double c = s.nextDouble();
					
			double maiorDiagonal = maiorDiagonal(a, b, c);
			
			if (verificaEsfera(maiorDiagonal, 10)) {
				q10 += quantidadeBrinquedos;
			}else if (verificaEsfera(maiorDiagonal, 15)) {
				q15 += quantidadeBrinquedos;
			}else if (verificaEsfera(maiorDiagonal, 20)) {
				q20 += quantidadeBrinquedos;
			}else if (verificaEsfera(maiorDiagonal, 25)) {
				q25 += quantidadeBrinquedos;
			}else {naoCabe = quantidadeBrinquedos;}
			
			System.out.println("Deseja informar main um lote? S/N");
			opcao = s.next();
		}
		
		System.out.println("Necessidade de compra: ");
		System.out.println("Esfera 10 cm: " + q10);
		System.out.println("Esfera 15 cm: " + q15);
		System.out.println("Esfera 20 cm: " + q20);
		System.out.println("Esfera 25 cm: " + q25);
		System.out.println("Não cabe: "+naoCabe);
	}
	private static boolean verificaEsfera(double diagonal, int tamanhoEsfera) {
		if (diagonal <= tamanhoEsfera){
			return true;
		}
		return false;
		
	}
	private static double maiorDiagonal(double a, double b, double c) {
		double somaDiagonal = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
		return Math.sqrt(somaDiagonal);
		
	}
}
