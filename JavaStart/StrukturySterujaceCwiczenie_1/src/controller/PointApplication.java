package controller;
import data.Point;

public class PointApplication{

    Point p = new Point();
    public void addX(Point p){
        p.setX(p.getX() + 1);
    }
    public void addY(Point p){
        p.setY(p.getY() + 1);
    }
    public void minusX(Point p){
        p.setX(p.getX() - 1);
    }
    public void minusY(Point p){
        p.setY(p.getY() - 1);
    }

}
