package CH20;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
    public int compare(GeometricObject ob1, GeometricObject ob2){
        double area1 = ob1.getArea();
        double area2 = ob2.getArea();

        if(area1 < area2) {return -1;}
        else if(area1 == area2){return 0;}
        else {
            return 1;
        }
    }
}
