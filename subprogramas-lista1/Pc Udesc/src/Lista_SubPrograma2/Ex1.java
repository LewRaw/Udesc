package Lista_SubPrograma2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] valores = new int[30];
		String opcao = "";
		int contador = 0;
		//
		opcao = questaoRepeticao(contador);
		while((opcao.equalsIgnoreCase("s")) && contador < 30) {
			
			System.out.println("Informe um valor inteiro: ");
			valores[contador] = s.nextInt();
			//
			contador ++;
			//
			opcao = questaoRepeticao(contador);
		}
		somaPares(valores);
		contaNegativos(valores);
		somaIntervalo(valores);
		
		lerArray(valores);
		s.close();
	}
	
	public static void somaPares(int[] valores) {
		int somaPar = 0;
		for(int i = 0; i < valores.length; i ++) {
			if ((((valores[i]%2) == 0) && valores[i] > 0)) {
				 somaPar += valores[i];
			};
		}
		System.out.println("A soma dos numeros pares é: "+ somaPar);
	}
	
	public static void contaNegativos(int[] valores) {
		int contaNegativos = 0;
		for(int i = 0; i < valores.length; i ++) {
			if (valores[i] <0 ) {
				 contaNegativos += 1;
			};
		}
		System.out.println("A quantidade de numeros negativos é: "+ contaNegativos);
	}
	
	public static void somaIntervalo(int[] valores) {
		int somaIntervalo = 0;
		for(int i = 0; i < valores.length; i ++) {
			if (valores[i] > 1 && valores[i] < 25 ) {
				somaIntervalo += valores[i];
			};
		}
		System.out.println("A soma dos numeros entre 1 e 25 é: "+ somaIntervalo);
	}
	
	public static void lerArray(int[] valores) {
		for(int i = 0; i < valores.length; i ++) {
			if(!(valores[i] == 0)) {
				System.out.println(valores[i]);
			}
			
		}
	}
	
	public static String questaoRepeticao(int contador) { 
		Scanner s = new Scanner(System.in);	
		String opcao = "";
		if(contador > 0) {
			System.out.println("Deseja continuar? S/N");
			 opcao = s.next();
		}else if(contador < 30){			
			System.out.println("Deseja iniciar? S/N");
			opcao = s.next();
		}else {
			opcao = "N";
		}
		return opcao;
	}
}
