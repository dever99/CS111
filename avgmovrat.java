public class avgmovrat
{
    public static void main(String [] args)
    {
        // args stores command line arguments 
        // args.length stores the number of arguments in the command line 

        int nFri = args.length; // number of people that went to the movies 
        int sum = 0; 
        int i = 0; // index on args 
        
        while( i < args.length)
        {
            // rat is only visible in the while loop 
            int rat = Integer.parseInt(args[i]); // rating 
            sum += rat; //sum = sum+rat;
            i++; // i = i+1; or i+=1; 
        }
        /*
         * for(int i = 0; i < args.length; i++)
         * {
         *   int rat = Integer.parseInt(args[i]);
         *   sum += rat; 
         * }
         * int i = 0 happens 1 time, then it checks to see if i is less than the number of friends, then the increment is done last, after the check is done, and runs the program in the body. 
         * 
         * 
         * i is the index of args 
         * int i = 0; happens ONE time 
         * i < nFri happens before going into koop 
         * i++ happens after the loop's body operations have been executed      
         */

        // integer divided by an integer results an integer 
        // make the numerator a double by multiplying it by 1.0, or cast it as a double 

        double avg = (sum*1.0)/nFri;  // this is it w/ multiplying sum by 1.0 

        // double avg = ((double)sum)/nFri;  this is it w/ casting sum, results the same as multiplying sum by 1.0 
        System.out.println("the movie ratings average is: "+avg);

        // rat is not visible outside of the while loop 


        /*
         * Scope of variables: 
         * It will tell us where the variable lies, and if we can use it 
         * Maybe the variable is declared inside of the loop, which means that the variable is only read in the loop, not outside of the loop, hence it is out of the scope. 
         * You can use static + variable, so that you can declare the variable in terms of the static context, and it can be accessed anywhere throught the program, or if you delcare a contstructor, you can also delcare a variable there, 
         * and you can import said file w/ constructor, and use the variable in a different progeam. 
         */

         /*
          * for loop: 
          for(init;while;increment)
          {
            body 
          }
          */

    }
}