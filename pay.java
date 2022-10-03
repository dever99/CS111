//Every program in java has to be inside of a class
public class pay 
{   
    // entry point of the program because the interpreter looks for the 
    //main method, and starts the execution of the program right here 
    public static void main(String[]args)
    {
            //command line inputs come inside of the program through args 
            //args[0] is first input 
            //args[1] is second input 

            //declare a type double that stores real nums 
            // use camelcase for variable names 
            double hourswor = Double.parseDouble(args[0]);
            double wag = Double.parseDouble(args[1]);
            if(hourswor < 0 || wag <= 0 )
            {
                System.out.println("ERROR");

            }
            else 
            {
                double totpay = hourswor*wag;
                System.out.println("total pay is: $"+totpay);
            }
    }
    
}
