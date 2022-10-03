import java.util.*;
public class uncle 
{
    static String dri; 
    static String typdri; 
    static void choozeBooze(String dri )
        {
            switch(dri)
            {
                case "whiskey":
                System.out.print("here you go "); 
            }

            
        }
    public static void main(String[]args)
    {
        Scanner crack = new Scanner(System.in);
        String nam; 
        int ag; 
        System.out.print("what is your name? ");
        nam = crack.nextLine(); 
        System.out.print("what is your age? ");
        ag = crack.nextInt(); 
        if(ag < 21)
        {
            System.out.println("you legally cannot drink, leave");
        }
        else
        {
            System.out.print("you legally can drink, what would you like to drink? ");
            dri = crack.nextLine(); 
            
        }
        
    }
}