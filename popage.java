public class popage 
{
    public static void main(String[]args)
    {
        StdOut.print("how many people reside in your town? ");
        int nPop = StdIn.readInt(); 

        // generate the ages of the population given from 0-120 y/o 
        for(int i = 0; i < nPop; i++)
        {
            StdOut.println((int)(Math.random()*121));
        }
        
    }
    
}
