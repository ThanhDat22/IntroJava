package CH20;

public class Rectangle extends GeometricObject {
    // Data fields
    private double width;
    private double height;

    // Constructors


    public Rectangle(){} // Default constructor

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        setWidth(width);
        setHeight(height);
    }

    // Getter: Reads the data filed

    /** Reads the width
     * @return: the width
     */
    public double getWidth() {
        return width;
    }

    /** Reads the height
     * @return: the height
     */
    public double getHeight() {
        return height;
    }

    // Setter: Updates the data filed


    /** Updates the width
     * @param newWidth: updated the width
     */
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    /** Updates the height
     * @param newHeight: updated the height
     */
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    // Methods

    /** Calculate the Area of the Circle
     * @return: the calculated area
     */
    @Override
    public double getArea(){ return width * height; }

    /** Calculate the Perimeter of the Circle
     * @return: the calculated perimeter
     */
    @Override
    public double getPerimeter(){ return (2 * (width + height)); }

    @Override
    public String toString(){
        return "The rectangle " + width + "x" + height + super.toString();
    }
}
