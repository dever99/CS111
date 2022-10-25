public class recursion 
{
    //iterative function 
    // n is the input of the function 
    public static int numDigits(int n) //function's signature 
    {
        int count = 0; 
        while(n > 0)
        {
            count++; 
            n/=10; //integer division, last digit is discarded 
        }
        //return type is an integer 
        return count; 
    }

    /*
     * we have these digits: 3 4 7 1 
     * When count is iterated by 1; it divides the number by 10, so 3471 then becomes 347
     * When count is iterated to 2; it divides the number by 10, so 347 becomes 34
     * when count is iterated to 3; it divides the number by 10, so 34 becomes 3
     * When count is iterated to 4, it divides the number by 10, so 3 becomes 0
     * 
     * 
     *  3 4 7 1 
     *  3 4 7 +1 
     *  3 4 +1 
     *  3 +1 
     * 0 +!
     * WHen we look at this, we have to sum 0+1+1+1+1, which is 4, and thats the number of digits we have 
     * the end of the journey is when it is 0. 
     * knowing when to stop is the base case for recursion, which is when it has to stop. 
     * the second step is known as the recursive step, which is the step in which it makes the problem smaller. 
     * 
     */
    
     // recursive function 
     // n is the input of the function 
     public static int rNumDig(int n )
     {
        // write the base case first, to make the recursion stop. 
        // in this case, we have to stop when n = 0; 
        if(n == 0)
        {
            // base case 
            // stop execution and return to caller 
            return 0; 

        }
        else
        {
            // recursive step OR general case 
            // in this case, to make the problem smaller, we have to divide n by 10. 
            int newN = n/=10; // reducing the problem to make it smaller (taking the last digit away)
            int count  = 1+ rNumDig(newN);
            // 1 refers to the digit we just removed 
            // it is being added to the call of the same function to compute the number of digits of the smaller number 
            // count will have the value, which is 1 + the value of numbers in each step of the function 
            return count; 

        }
     }
     // print numbers down from n to 1 
     // if n = 5, it prints 5 4 3 2 1 
     // iterative
     public static void iPrintNum(int n )
     {
        for( int i = n; i >= 1; i--)
        {
            StdOut.print(i+" "); 
        }
     }
     // recursive
     public static void rPrintNum(int n )
     {
        if(n == 0)
        {
            return; 
        }
        else 
        {
            StdOut.print(n+" ");
            int newN = n-1; // reducing the problem 
            rPrintNum(newN); // recursive step on a smaller problem 
        }

     }
     // base case is when n = 1, so the if loop is when n equals 1, it has to print out 1. 
     // recursive step is when n does not equal 1, and when it is that case, it displays n, and then it calls the function again, where 1 is being subtracted to n. 

     // int to binary 
     // recursive 
     public static void rCon(int n )
     {
        int quo = n/2; 
        int rem = n%2;
        if(quo == 0)
        {
            //base case, quotient is 0 
            //need to print remainder 
            StdOut.print(rem); 
        }
        else
        {
            // recursive step (gen case )
            rCon(quotient); 
            StdOut.print(rem); 
        }

     }
    public static void main(String[]args)
    {


    }
    
}
