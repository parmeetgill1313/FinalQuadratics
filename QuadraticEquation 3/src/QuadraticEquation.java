
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class QuadraticEquation {

    private double myA;    // the 'a' in equation
    private double myB;    // the 'b' in equation
    private double myC;    // the 'c' in equation
    private double myDisc; // b*b - 4*a*c

    double Product, diff;
    double i;
    boolean stop = false;
    double x, x2;

    // constructor
    public QuadraticEquation(double a, double b, double c) {
        myA = a;
        myB = b;
        myC = c;
        calculateDisc();
    }

    // calculate discriminant
    private void calculateDisc() {
        myDisc = myB * myB - 4.0 * myA * myC;
    }

    // check if there are real roots
    public boolean hasSolution() {
        if (myDisc < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void compute1() {
        Product = myA * myC;
        if (isPerfectSquare() == true) {
            while (!stop) {
                System.out.println("Diff  myB     i          P");
                for (i = 1;; i++) {
                    diff = myB - i;
                    System.out.println(diff + "= " + myB + " - " + i + "    P = " + Product);
                    if (i * diff == Product) {
                        //diff = diff * (-1);
                        stop = true;
                        break;
                    }
                    diff = myB + i;
                    System.out.println(diff + "= " + myB + " + " + i + "   P = " + Product);
                    if (-i * diff == Product) {
                        //i = i * (-1);
                        stop = true;
                        break;
                    }
                }
            }
        }
    }
    // calculate first root

    public double calculateSolution1() {
        x = (-diff) / myA;
        if (isPerfectSquare() == false) {
            return ((-myB + (Math.sqrt(myDisc))) / (2.0 * myA));
        } else //        if (myA*diff*diff+myB*diff+myC == 0)
        //            return (diff/myA);
        //        else{
        //            return (diff*-1)/myA;
        //        }
        //          if (diff > 0){
        //return (-diff)/myA;
        //          }
        //          else{
        //              return diff/myA;
        //          }
        //if (i * diff == P) 
        {
            return x;
        }
        // else if (-i * diff == P){
        //    return diff / myA;
        //    }
        // else{
        //    return 0;
        // }
    }

    // calculate second root
    public double calculateSolution2() {
        x2 = i / myA;
        if (isPerfectSquare() == false) {
            return ((-myB - (Math.sqrt(myDisc))) / (2.0 * myA));
        } else //         if (myA*i*i+myB*i+myC == 0)
        //            return (i/myA);
        //        else{
        //             i = i * -1.0;
        //            return (i*-1)/myA;
        //        }
        //        if(i > 0){
        // return (-i)/myA;
        //        }
        //        else{
        //            return i/myA;
        //        }
        if (i * diff == Product) {
            return (-i) / myA;
        } else if (-i * diff == Product) {
            return x2;
        } else {
            return 0;
        }

    }

    public boolean isPerfectSquare() {
        double sr = Math.sqrt(myDisc);
        if ((sr - Math.floor(sr)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void VertexForm(double a, double p, double q) {
        NumberFormat df = new DecimalFormat("#0.000");
        this.myA = a;
        //double addsub = (myB / 2) * (myB / 2);
        p = (myB) / (2 * myA);
        //q = myC - (myA * ((myB/2)*(myB/2)));
        double dis = ((myB*-myB)+ (4*myA*myC));
        //System.out.println("dis" + dis);
        q = (dis/(4*myA));
      
       // q = myC + (-addsub * myA);
        
        if(p > 0)
        System.out.println("Vertex Form: " + a + "(x + " + df.format(p) + ")^2 " + df.format(q) + " = 0");
        else
        System.out.println("Vertex Form: " + a + "(x" + df.format(p) + ")^2 + " + df.format(q) + " = 0");
        boolean max = false;

        if (a < 0) {
            max = false;
            System.out.println("Graph is a Minnium");
            System.out.println("It opens down");
            System.out.println("Range: Infinity, " + df.format(q));
            
        } else {
            max = true;
            System.out.println("Graph is a Maximum");
            System.out.println("It opens up");
            System.out.println("Range: " + df.format(q) + ", infinity" );
        }
        System.out.println("Domain: All real Numbers");
        
        System.out.println("Vertex: " + df.format(-p) + ", " + df.format(q));
        System.out.println("Axis of Symmetry: " + df.format(-p));

        System.out.println("y-Intercept: " + myC);
    }


}
