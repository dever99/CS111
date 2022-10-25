/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Anirudh Deveram ard238 ard238@scarletmail.rutgers.edu
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit 
{
    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);
        int leftSum = 0;
        int rightSum = 0;
        long temp =  num;
        int counter = 0;
        long digit = 0;
        while (num > 0) {
            num = num / 10;
            counter++;

        }
        while (temp > 0) {
            digit = temp % 10;
            counter--;

            if (counter % 2 != 0) {
                rightSum += digit;
            } else {
                leftSum += digit;
            }
           
            temp = temp / 10;
        }
       
        int lSum1 = leftSum % 10;
      
        int rSum1 = rightSum % 10;
      
        int rSum2 = rSum1 * 3;
      
        int rSum3 = rSum2 % 10;
     
        int finSum = (lSum1 + rSum3)%10;
        System.out.println(finSum);
    }
}