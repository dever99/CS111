public class variables 
{
    //body of the class 

    public static void main(String[]args)
    {
        //integer variables 
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int n4 = Integer.parseInt(args[3]);
        int n5 = Integer.parseInt(args[4]);

        //boolean variable 
        boolean b1 = Boolean.parseBoolean(args[5]);

        //display
        System.out.println(n5);

        //logical and relational operators 
        if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
        {
            System.out.println(n1 + " is greater than all other values");
        }
        System.out.println("boolean value: "+b1);
        boolean notb1 = !b1; //negates b1
        System.out.println("notb1 value is: "+notb1);


        if(n1 > n2 && n1 >= n3)
        {
            System.out.println(n1 + " , " + n2 + " , " + n3 + " ");
        }

        //comparison is ==
        if(n1 == n2)
        {
            System.out.println("the two numbers are the same");
        }

        //casting another variable into another datatype
        //it is transforming an integer into a string, implicit casting  

    }
}
