package CH20;

import java.util.Date;

public abstract class GeometricObject {
    //Data fields
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // Constructors

    protected GeometricObject(){ dateCreated = new Date(); } // Default constructor
    protected GeometricObject(String color, boolean filled){ // Constructor with initial
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    // Getters: Reads the private data fields

    /**  Reads the color of Geometric Object
     * @return: the colors.
     */
    public String getColor() {
        return color;
    }

    /** Reads the filled
     * @return: filled
     */
    public boolean isFilled() {
        return filled;
    }

    /** Reads the created Date
     * @return: the Date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    // Setters: Updates the private data fields

    /** Updates the color
     * @param color: the color of Geometric Object
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Updates the filled
     * @param filled: updated the filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Updates the date that created
     * @param dateCreated: the date
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    // Methods

    @Override
    public String toString(){
        return " created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea(); // Abstract method that calculates the area.
    public abstract double getPerimeter(); // Abstract method that calculates the perimeter.
}
