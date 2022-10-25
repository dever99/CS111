import java.util.*;

import javax.lang.model.util.ElementScanner14; 
public class classroom 
{
    public static void main(String[]args)
    {
        Scanner Scammer = new Scanner(System.in);
        System.out.print("How many students are in this class? ");
        //int n = Scammer.nextInt(); 
        int numStudents = StdIn.readInt(); // reads an integer from the keyboard 
        
        // 1d array fpo students to stand in line before coming into the classroom 
        String[] inLine = new String[numStudents];

        for(int i = 0; i < inLine.length; i++) //iterating through array 
        {
            System.out.print("Enter the name of the student at positon "+i+" ");
            inLine[i] = StdIn.readString(); // reads a string from the keyboard, and stores it in the array 
        }
        // print students in line using the enhanced for loop (foreach loop)

        for(String stu : inLine)
        {
            // stu is assigned a value from the array at each iteration 
            // starts at 0 
            System.out.print(stu+" - ");


        }
        System.out.println(); 

        System.out.print("How many rows of seats are in the class? ");
        int row = StdIn.readInt(); 
        System.out.print("How many seats are there in each row? ");
        int col = StdIn.readInt(); 

        //create a 2d array to emulate a classroom with seats 
        String[][] room = new String[row][col];

        // add students from line into room in row-major order 
        // this emulates the students coming into the classroom 
        // in a single line and sitting in the first row unil 
        // it is filled, then the second row, and so on...
       
        // need to create a variable that iterates through the array 
        int in = 0; // indexes in the inLine array 
        for(int r = 0; r < room.length;r++)
        {
            for(int c = 0; c < room[r].length; c++)
            {
                if(in < inLine.length)
                {
                    room[r][c] = inLine[in];
                    in+=1; // goes to the next student in inLine
                }
                else 
                {
                    break; 
                }
                if(inLine.length < in)
                {
                    break; 
                }
                if(room[r][c] == null)
                {
                    // null means there is nothing in there 
                    // no student sitting there 
                }
                else
                {
                    inLine[in] = room[r][c]; 
                    in++; 
                }
    
            }
            for(int f = 0; f < room.length; f++)
            {
                for(int k = 0; k < room[f].length;k++)
                {
                    System.out.print(room[f][k]+" ");
                }
                System.out.println(); 
            }
            
        }
        // students leave the classroom in a single line 
        // fill up the line columnwise (first column (all rows), second column (all rows), etc. )
        in = 0; 
        for(int c = 0; c < room[0].length; c++)
        {
            for(int r = 0; r < room.length; r++)
            {
                if(in < inLine.length)
                {
                    inLine[in] = room[r][c]; 
                    in++;
                } 
                else if (inLine.length < in)
                {
                    break; 
                }
                else
                {
                    break; 
                }
            }
            
        }    
        System.out.println("Students are leaving columnwise: ");
        for(String stu : inLine)
        {
            System.out.println(stu+" - "); 
        }
        // null prints out, since when inLine points to the array, there is a null that is placed in there 
        // where null is holding an empty value, and when we call it, it prints out "null", which is a placeholder for an object 
        // as null holds a value that isn't there. 
    
    
    
    }
    
}
