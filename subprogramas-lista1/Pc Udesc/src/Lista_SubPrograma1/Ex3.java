package Lista_SubPrograma1;

import java.util.Scanner;

public class Ex3 {

	public static String verificaValorPrimo(int valor) {
		String primo = "S";

		for (int i = (valor - 1); i >= 2; i--) {

			if (valor % i   == 0) {
				primo = "F";
				break;
			}
		}
		return primo;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("informe um valor inteiro positivo: ");
		int valor = s.nextInt();
		if (!(valor > 0)) {
			System.out.println("Valor inválido!");
		} else {
			String resultado = verificaValorPrimo(valor);
			System.out.println(resultado);
		}
	}

}
