package Lista_SubPrograma2;

import java.util.Scanner;

public class Ex3 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Informe um valor inteiro: ");
		int valor = s.nextInt();
		int[] divisores = new int[valor];
		divisores = obterDivisores(valor);		
		System.out.println(verificaNumero(divisores, valor));		
		lerArray(divisores);
	}
	
	private static int[] obterDivisores(int valor) {
		int[] divisores = new int[valor];
		int indice = 0;
		for(int i = (valor - 1); i > 0; i--) {
			if (valor % i == 0) {
				divisores[indice] = i;
				indice ++;
			}
		}
		return divisores;
	}
	
	private static String verificaNumero(int[] array, int valor) {
		int somaDivisores = 0;
		for(int i = 0; i < array.length; i ++) {
			somaDivisores += array[i];			
		}
		if (somaDivisores == valor) {
			return "Número perfeito!";
		}else {
			return "Número não perfeito!";
		}
	}
	
	private static void lerArray(int[] array) {
		System.out.println();
		System.out.println("Divisores:");
		for(int i = 0; i < array.length; i ++) {
			if(!(array[i] == 0)) {
				System.out.println(array[i]);
			}
			
		}
	}
}
