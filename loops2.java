public class loops2 
{
    /*
     * Given a number n, display a n*n sequence of stars 
     * 
     * ex:n = 3
     * ***
     * ***
     * ***
     */
    public static void main(String[]args)
    {
        int n = Integer.parseInt(args[0]);
        int x = 0; 
        while(x < n)
        {
            for(int i = 0; i < n; i++)
        {
            
            System.out.print("*");
            
        }
        System.out.println();
        x++;
        }
        
        /*
         * for(int j = 0; j < n; j++)
         * {
         *      for(int i = 0; i < n; i++)
         *      {
         *          System.out.print("*");
         *      }
         *          System.out.println(); 
         * }
         */
        

    }
    
}
