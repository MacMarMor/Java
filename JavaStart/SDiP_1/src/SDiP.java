import data.Point;
import  controller.PointApplication;

public class SDiP {
    public static void main(String[] argv){
        Point punkt = new Point(10, 10);
        PointApplication pA = new PointApplication();

        System.out.println("Punkt: " + punkt.getX() + " " + punkt.getY());
        pA.addX(punkt);
        System.out.println("Punkt addX: " + punkt.getX() + " " + punkt.getY());
        pA.addY(punkt);
        System.out.println("Punkt addY: " + punkt.getX() + " " + punkt.getY());
        pA.minusX(punkt);
        System.out.println("Punkt minusX: " + punkt.getX() + " " + punkt.getY());
        pA.minusY(punkt);
        System.out.println("Punkt minusY: " + punkt.getX() + " " + punkt.getY());
    }
}
