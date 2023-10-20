package Lista_SubPrograma2;

import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class Ex2 {
	static Scanner s = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("##.####");
	
	public static void main(String[] args) {
		int formaGeometrica = questaoFormaGeometrica();
		double volumeCalculado = 0.00;
		if (formaGeometrica == 1) {
			volumeCalculado = calculaCubo();
		}else if (formaGeometrica == 2) {
			volumeCalculado = calculaParalelepipedo();
		}else if (formaGeometrica == 3) {
			volumeCalculado = calculaCilindro();
		}else if (formaGeometrica == 4) {
			volumeCalculado = calculaEsfera();
		}else if (formaGeometrica == 5) {
			volumeCalculado = calculaCone();
		}
		
		if (formaGeometrica >= 1 && formaGeometrica <=5) {
			System.out.println("Volume: "+ df.format(volumeCalculado)+ "m³");
		}else {
			System.out.println("Valor incorreto");
		}
	}
	private static double calculaCubo() {
		System.out.println( "Informe o tamanho(m) da aresta do cubo: ");
		double aresta = s.nextDouble();
		return Math.pow(aresta, 3);		
	}
	
	private static double calculaParalelepipedo() {
		System.out.println( "Informe a largura(m) do Paralelepípedo: ");
		double largura = s.nextDouble();
		System.out.println( "Informe o comprimento(m) do Paralelepípedo: ");
		double comprimento = s.nextDouble();
		System.out.println( "Informe a altura(m) do Paralelepípedo: ");
		double altura = s.nextDouble();		
		return largura * comprimento * altura;		
	}
	
	private static double calculaCilindro() {
		System.out.println( "Informe o raio(m) de uma face circular do Cilindro: ");
		double raio = s.nextDouble();	
		System.out.println( "Informe a altura(m) do Cilindro: ");
		double altura = s.nextDouble();		
		return Math.PI * Math.pow(raio, 2) * altura;
	}
	
	private static double calculaEsfera() {
		System.out.println("Informe o raio(m) da esfera:");
		double raio = s.nextDouble();
		return Math.PI * Math.pow(raio, 3) * 4/3;
	}
	
	private static double calculaCone() {
		System.out.println("Informe o raio(m) do círculo:");
		double raio = s.nextDouble();
		System.out.println("Informe a altura(m) do circulo:");
		double altura = s.nextDouble();	
		return  Math.PI * Math.pow(raio, 2) * altura * 1/3;
	}
	
	private static int questaoFormaGeometrica(){
		System.out.println("--- Calculadora de volume");
		System.out.println("--- Informe o numero da forma geométrica desejada: ");
		System.out.println("1 - Cubo");
		System.out.println("2 - Paralelepípedo");
		System.out.println("3 - Cilindros");
		System.out.println("4 - Esferas");
		System.out.println("5 - Cones");
		int opcao = s.nextInt();
		
		return opcao;
	}
}
