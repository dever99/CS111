public class DisplayEvenNumbers 
{
    public static void main(String[]args)
    {
        int num = 1;
        while (num < 100)
        {
            // while loop's body 
            // executed every time the boolean expression is true 
            if(num%2 == 0)
            {
                //number is even 
                System.out.println(num);
                
            }
            num++;


        }
    }
    
}
