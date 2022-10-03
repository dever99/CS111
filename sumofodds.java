public class sumofodds 
{
    public static void main(String[]args)
    {
        // sum of odd numbers between x and y 
        // precond is x and y are ints 

        int x = Integer.parseInt(args[0]); // declaring x to be of type int, storing user input into x 
        int y = Integer.parseInt(args[1]); // declaring y to be of type int, storing user input into y 
        int sum = 0; // summing variable 
        while(x < y)
        {
            if (x % 2 != 0)
            {
                // number is odd 
                sum+=x; // same as sum = sum+x;
            }
            x++; // same as x = x+1; or x+=1;
        }
        System.out.println(sum);

    }
    
}
