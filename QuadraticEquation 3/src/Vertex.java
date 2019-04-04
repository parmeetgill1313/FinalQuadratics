
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Vertex {

    public double a1;    // the 'a' in equation
    public double b;    // the 'b' in equation
    public double c;    // the 'c' in equation

    //QuadraticEquation quad = new QuadraticEquation(a1, b, c);

    public Vertex(double a, double p, double q) {
        this.a1 = a;
        this.b = p;
        this.c = q;
    }

    public void VertexForm(double a, double p, double q) {
        NumberFormat df = new DecimalFormat("#0.000");
        double x1, x2;
        double yInt;
        
        if(p > 0)
        System.out.println("\n\nVertex Form: " + a + "(x + " + p + ")^2 " + q + " = 0");
        else
        System.out.println("\n\nVertex Form: " + a + "(x" + p + ")^2 + " + q + " = 0");
        
        boolean max = false;

        //System.out.println(a + "x^2 " + p*2 + "x " + );
        
        if (a < 0) {
            max = false;
            System.out.println("Graph is a Minnium");
            System.out.println("It opens down");
            System.out.println("Range: infinity, " + q);

        } else {
            max = true;
            System.out.println("Graph is a Maximum");
            System.out.println("It opens up");
            System.out.println("Range: " + q + ", infinity");
        }
        System.out.println("Domain: all real numbers");

        System.out.println("Vertex: " + -p + ", " + q);
        System.out.println("Axis of Symmetry: " + p);
        
        yInt = ((a * ((0 + p) * (0 + p))) + q);
        System.out.println("y-Intercept: " + yInt);
        
        x1 = ((-1)*p)+(Math.sqrt(q*(-1)*a));
        x2 = ((-1)*p)-(Math.sqrt(q*(-1)*a));
        
        System.out.println("Solutions: " + df.format(x1) + " and " + df.format(x2));
        
    }


}
