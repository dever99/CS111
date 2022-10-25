public class numProbsCaller
{
    public static void main(String[]args) // function signature this one is predetermined by java, so we have to follow it. 
    {
        // call the numOfDigits function 
        // returns an int 
        // a public static function belongs to the class itself 
        int num = numprobs.numOfDigits(1287943); 
        //StdOut.println(num); 
        System.out.println(num); 

        num = numprobs.numOfDigits(564); 
        //StdOut.println(num); 
        System.out.println(num); 
    }
}