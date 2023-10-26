package Lista_SubPrograma1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Informe A, B e C");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		System.out.println(calculoBaskara(a, b, c));
	}
	private static String calculoBaskara(double a, double b, double c) {
		double delta = Math.sqrt( b * b - (4 * a * c));
		System.out.println(delta);
		if(delta >= 0) {
			double raizA = ((-b) + delta)/(2*a);
			double raizB = ((-b) - delta)/(2*a);
			return "r1 " + raizA + " r2 " + raizB;
		}
		return "Solução não real";
	};
}

