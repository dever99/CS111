public class displaydig 
{
    public static void main(String[]args)
    {
        int num = 1234; //Integer.parseInt(args[0]);
        

        /*
            while loop 
         * while(num > 0)
        {
            int dig = num%10; 
            System.out.println(dig+" ");
            num /=10; // num = num/10; 
        }
         */
        
         //for loop 
        for(;num>0;num/=10)
        {
            int dig = num%10; 
            System.out.println(dig+" ");
            
        }

    }
    
}
