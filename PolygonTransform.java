/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) 
    {
        double [] copyArray = new double [array.length]; 
        for(int i = 0; i < copyArray.length; i++)
        {
            copyArray[i] += array[i]; 
        }
        return copyArray;
	
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) 
    {
        double[] scaleX = new double [x.length]; 
        double [] scaleY = new double [y.length]; 
        double scale = alpha; 
        for(int i = 0; i < scaleX.length; i++)
        {
            scaleX[i] = x[i]*scale; 

        }
        for(int j = 0; j < scaleY.length; j++)
        {
            scaleY[j] = y[j]*scale; 
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) 
    {
        double [] transX = new double [x.length]; 
        double [] transY = new double [y.length]; 
        double changeX = dx; 
        double changeY = dy; 
        for(int i = 0; i < transX.length; i++)
        {
            transX[i] = x[i]+changeX; 
        }
        for(int j = 0; j < transY.length; j++)
        {
            transY[j] = y[j]+changeY; 
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) 
    {

    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) 
    {

	// WRITE YOUR CODE HERE
    }
}
