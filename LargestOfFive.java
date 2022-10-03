import javax.lang.model.util.ElementScanner14;

/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Anirudh Deveram ard238 ard238@scarletmail.rutgers.edu 
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int d1 = Integer.parseInt(args[0]);
        int d2 = Integer.parseInt(args[1]);
        int d3 = Integer.parseInt(args[2]);
        int d4 = Integer.parseInt(args[3]);
        int d5 = Integer.parseInt(args[4]);
        
        if(d1 > d2 && d1 > d3 && d1 > d4 && d1 > d5)
        {
            System.out.println(d1);
        }
        else if (d2 > d1 && d2 > d3 && d2 > d4 && d2 > d5)
        {
            System.out.println(d2);

        }
        else if (d3 > d2 && d3 > d1 && d3 > d4 && d3 > d5)
        {
            System.out.println(d3);

        }
        else if (d4 > d2 && d4 > d3 && d4 > d1 && d4 > d5)
        {
            System.out.println(d4);
        }
        else
        {
            System.out.println(d5);
        }
    }
}