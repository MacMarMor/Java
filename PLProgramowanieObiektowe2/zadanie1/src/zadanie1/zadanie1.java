package zadanie1;
import java.util.Scanner;
import java.lang.Math;

public class zadanie1 {
	public static void main( String[] argv ) {
		
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj argumenty zmiennych a, b, c w równaniu x = a^2 + bx + c");
		
		double a, b, c, delta, x1, x2, x0;
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.println("Podane zmienne a:" + (int) a + " b: " + (int) b + " c:" + (int) c );
		System.out.println("Twoja delta wynosi: " + (int) delta);
		
		if( delta < 0 ) {
			System.out.println("Równanie kwadratowe ax^2+bx+c nie ma miejsc zerowych");
		}
		else if( delta == 0) {
			x0 = -b /(2*a);
			System.out.println("Równanie kwadratowe ax^2+bx+c ma jedno miejsce zerowe x0 wynosi: " + (int) x0);
		}
		else {
			x1 = ( Math.pow(b, 2) + Math.sqrt(delta) ) / (2*a) ;
			x2 = ( (- Math.pow(b, 2)) - Math.sqrt(delta) ) / (2*a) ;
			System.out.println("Równanie kwadratowe ax^2+bx+c ma dwa miejsca zerowe x1: " + (int) x1 + " i x2: " + (int) x2 );
		}
		
		}catch(Exception e) {
			System.out.println("Jedna z Twoich zmiennych nie była liczbą! Popraw i spróbuj jeszcze raz");
		}finally {
			System.out.println("Zrobiono");
		}
	}

}
