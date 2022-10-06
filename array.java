import java.util.*; 
public class array
{
	/* Notes 
	 * declare: 
	 * int [] intArray; <- pointing to an array of integers 
	 * char[] charArray; <- pointing to an array of characters 
	 * 
	 * Create: 
	 * intArray = new int[4]
	 * intArray[0] = 7; 
	 * intArray[1] = 9; 
	 * 
	 * charArray = new char[3]
	 * 
	 * int[] anotherA = {1,2,3,4,5}
	 * 
	 * 
	 * String[]args <- represents an array for strings called args 
	 * args[0] <- assigning a value for that specific index in the array 
	 * you would use args.length to see how many values are in the array (size of the array) 
	 * ____.length returns the size of the array 
	 * arrays usually start at 0; so you have to either use i = 0; or 
	 * 
	 * args is pointing to an array of size 3, and youre PASSING 3,6,7, and 3 is at index 0, (pos 1) 6 is at index 1,(pos 2)  and 7 is index 2 (pos 3) 
	 * args.length = array size = 3  
	 * 
	 */
	
	public static void main(String[]args)
	{
		Scanner Scammer = new Scanner(System.in); 
		int numOfVal = args.length; //Number of arguments from the command line 
		//int [] numOfVal = new int [3]; 
		//for(int k = 0; k < numOfVal.length; k++)
		//{
			//System.out.print("Enter a value for the array: "); 
			//numOfVal[k] = Scammer.nextInt();
			
		//}
		//System.out.println("Number of values entered: "+numOfVal.length);
		
		// to traverse array, need a for loop 
		
		
		//for(int i = 0; i < numOfVal.length; i++)
		for(int i = 0; i < numOfVal; i++)
		{
			//System.out.println(numOfVal[i]);
		}
		
		// declare and create an integer array 
		int[] intArray = new int[numOfVal]; 
		
		//fill up the array with values from cmd 
		// intArray is the args array converted into integers 
		for(int f = 0; f < numOfVal; f++)
		{
			intArray[f] = Integer.parseInt(args[f]); 
		}
		// sum of all values in intArray 
		int sum  = 0; // ini to 0
		
		for( int g = 0; g < intArray.length; g++)
		{
			sum+= intArray[g]; // same as sum = sum + intArray[g];
		}
		System.out.println(sum);

        // create a new array and fill it up with random numbers
		double [] doubArray = new double [100];
		double rand  = Math.random(); // returns a random number between (0.0,1.0)
        double su = 0.0; 
		for(int h = 0; h < doubArray.length; h++)
		{
			doubArray[h] = rand; 
		}
        for(int l = 0; l < doubArray.length; l++)
        {
            System.out.println(doubArray[l]);
            su+= doubArray[l];
        }
        double avg = su /doubArray.length; 
        System.out.println(su+" "+avg);
        double great = 0; 
        for(int b = 0; b < doubArray.length; b++)
        {
            if(doubArray[b] > avg)
            {
                great++; 
            }
        }

        System.out.println("Number of values greater than the average: "+great); 

		
		
		
	}

}
