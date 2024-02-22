package CH20;

public class Circle extends GeometricObject {
    // Data fields
    private double radius;

    // Constructors

    public Circle(){} // Default constructor
    public Circle(double radius){ setRadius(radius); } // Constructor with initial

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    // Getter: Reads the data filed

    /** Reads the radius
     * @return: the radius
     */
    public double getRadius() {
        return radius;
    }

    // Setter: Updates the data filed

    /** Updates the radius
     * @param newRadius: updated radius
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // Methods

    /** Calculate the Area of the Circle
     * @return: the calculated area
     */
    @Override
    public double getArea(){ return Math.PI * pow(radius, 2); }

    /** Calculate the Perimeter of the Circle
     * @return: the calculated perimeter
     */
    @Override
    public double getPerimeter(){ return 2 * radius * Math.PI; }

    @Override
    public String toString(){
        return "The circle with radius: " + getRadius() + super.toString();
    }

    /**
     * Calculates the pow base^exponent
     * @param base: the base
     * @param exponent: the exponent
     * @return: calculated the pow
     */
    private double pow(double base, int exponent){
        if(exponent == 0){ return 1; }
        else{ return base * pow(base, exponent - 1); }

    }
}
