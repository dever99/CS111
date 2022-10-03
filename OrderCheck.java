/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Anirudh Deveram, ard238@scareltmail.rutgers.edu, ard238 
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck 
{

    public static void main(String[] args) 
    {

	// WRITE YOUR CODE HERE
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);
    boolean isOrder = false; 

    /*while(a > b && b > c && c > d || d > c && c > b && b > a)
    {
        isOrder = true;
        System.out.println(isOrder);
        break;
    } 
    
        System.out.println(isOrder);
    */
    /*if(a > b && b > c && c > d || d > c && c > b && b > a)
    {
        isOrder = true;
        System.out.println(isOrder);
        
    } 
    else
    {
        System.out.println(isOrder);
    }
     */ 
    while(a > b && b > c && c > d || d > c && c > b && b > a)
    {
        isOrder = true;
        System.out.println(isOrder);
        break;
    } 
    
        System.out.println(isOrder);
	
    }
}
