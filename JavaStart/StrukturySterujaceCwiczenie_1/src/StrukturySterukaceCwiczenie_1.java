import controller.PointApplication;
import data.Point;

import java.util.Scanner;

public class StrukturySterukaceCwiczenie_1 {

        public static void main(String[] argv){
            Point punkt = new Point(10, 10);
            PointApplication pA = new PointApplication();

            final int add_x = 0;
            final int add_y = 1;
            final int minus_x = 2;
            final int minus_y = 3;

            int opcja;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj operacje na punkcie");
            opcja = scanner.nextInt();
            switch (opcja){
                case add_x:
                    pA.addX(punkt);
                    break;
                case add_y:
                    pA.addY(punkt);
                    break;
                case minus_x:
                    pA.minusX(punkt);
                    break;
                case minus_y:
                    pA.minusY(punkt);
                    break;
                default:
                    System.out.println("Błąd");
                    break;
            }

            System.out.println("Punkt po operacji: " + punkt.getX() + " " + punkt.getY());
        }
}
