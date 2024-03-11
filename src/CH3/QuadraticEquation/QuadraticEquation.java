package CH3.QuadraticEquation;


/*

 */
public class QuadraticEquation {
    // Data fields
    double a, b, c;

    // Constructors

    public QuadraticEquation(){} // Default constructor
    public QuadraticEquation(double a, double b, double c) { // Initial constructor
        setA(a);
        setB(b);
        setC(c);
    }

    // Getters

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    // Setters

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Methods
    private double discriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }
    private boolean solveable() {
        if(discriminant() < 0) {return false;}
        else { return true; }
    }

    /** Keeps two digits after the point in double number
     * @param value: the double number
     * @return : the number with two digits after the point
     */
    private double keepHunredths(double value) {
        return (int)(value * 100) / 100.00;
    }

    public String solve(){
        String outputString = "";
        if(!solveable()) {
            outputString = "The equation has no real roots";
        }
        else {
            if (discriminant() == 0) {
                double root = 0;
                root = -b / (2 * a);
                outputString = "The equation has one root: " + keepHunredths(root);
            }
            else {
                double root1, root2;
                root1 = (-b + Math.sqrt(discriminant()) / (2 * a));
                root2 = (-b - Math.sqrt(discriminant())) / (2 * a);
                outputString = "The equation has two roots: " + keepHunredths(root1) + " and " + keepHunredths(root2);
            }
        }
        return outputString;
    }

    public static void main(String[] args) {
        QuadraticEquation pb1 = new QuadraticEquation(1, 2.0, 3);
        System.out.println(pb1.solve());
    }
}
