package CH20;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args){
        GeometricObject g1 = new Rectangle(5,5);
        GeometricObject g2 = new Circle(5);
        GeometricObject g = max(g1, g2 ,new GeometricObjectComparator());

        System.out.printf("The area of the larger object is %.2f of ", g.getArea());
        System.out.println(g.toString());
    }
    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c){
        if(c.compare(g1, g2) > 0) {return g1;}
        else{return g2;}
    }
}
