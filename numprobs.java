public class numprobs 
// writing a library, do not need a main method, just writing the functions we want our users to use 
// collection of functions that provides functionalities 
{
    // function to count the number of digits in an integer 
    // input is a number 

    public static int numOfDigits (int num)
    {
        // function's body 
        int count = 0; 
        while(num > 0)
        {
            count++; 
            // integer division 
            num /=10; // removes the last digit 
        }
        // return the number of digits 
        return count;
    }
    
}
