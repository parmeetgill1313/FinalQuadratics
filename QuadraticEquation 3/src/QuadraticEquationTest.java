//
//import java.io.*;
//
//public class QuadraticEquationTest {
//
//    public static void main(String[] args) throws IOException {
//        // Set up for input
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//        // input three doubles for a, b, and c
//        System.out.print("Type value for 'a' --->");
//        String input = in.readLine();
//        double a = Double.parseDouble(input);
//
//        System.out.print("Type value for 'b' --->");
//        input = in.readLine();
//        double b = Double.parseDouble(input);
//
//        System.out.print("Type value for 'c' --->");
//        input = in.readLine();
//        double c = Double.parseDouble(input);
////
////        // print the three inputs
////        // create a Quadratic Equation object
////        QuadraticEquation quad = new QuadraticEquation(a, b, c);
////        if (b < 0 && c < 0) {
////            System.out.println("Equation: " + a + "x^2" + b + "x" + c);
////        } else if (b > 0 && c < 0) {
////            System.out.println("Equation: " + a + "x^2 + " + b + "x " + c);
////        } else if (b < 0 && c > 0) {
////            System.out.println("Equation: " + a + "x^2 " + b + "x + " + c);
////        } else {
////            System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c);
////        }
////        // calculate roots
////        // first check a, so we don't divide by 0
////        if (a == 0) {
////            System.out.println("Not a quadratic equation");
////        } // next check if disc < 0, using hasSolution()
////        else if (quad.hasSolution() == false) {
////            System.out.println("No real solutions");
////        } // finally calculate and print solutions
////        else {
////            quad.compute1();
////            double solution1 = quad.calculateSolution1();
////            double solution2 = quad.calculateSolution2();
////
////            System.out.println("Solution 1 = " + solution1
////                    + ", Solution 2 = " + solution2);
////            //1, 3, 2      test
////            //9, 0, -169   b = 0
////            //4, 7, 0      c = 0
////            //1.4, 4.3, 2  quad formala and decimals
////            //4, 66, -34      large numbers
////        }
////
//        //quad.VertexForm(a, b, c);
//        Vertex v= new Vertex (a,b,c);
//        v.VertexForm(a, b, c);
//    }
//}