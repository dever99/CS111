/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	int steps = Integer.parseInt(args[0]);
    int xVal = 0; 
    int yVal = 0;  
    System.out.println("("+xVal+","+yVal+")");
    for(int i = 0; i < steps; i++)
    {
        double probVal = Math.random();
        if(probVal < 0.25)
        {
            xVal++; // moves right 
        }
        else if(probVal < 0.5)
        {
            yVal++; // moves left 
        }
        else if(probVal < 0.75)
        {
            yVal--; // moves up 
        }
        else if (probVal < 1.0)
        {
            xVal--;  // moves down 
        }
        System.out.println("("+xVal+","+yVal+")");
    }
    double x = xVal*xVal;
    double y = yVal*yVal; 
    double square = x+y;
    System.out.println("Squared distance = "+ square);

    }
}
