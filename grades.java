public class grades 
{
    public static void main(String[]args)
    {
        
        int students = Integer.parseInt(args[0]); 
        
        int assignments = Integer.parseInt(args[1]); 
        
        
        // create a 2d array 
        // students are rows, assignments are columns 
        
        double [] [] scores = new double [students][assignments];
        
        // r = rows 
        // could use students as well, but it is safer to use the array, so you don't go out of bounds. 
        for(int r = 0; r < scores.length; r++ )
        {
            //traverse the columns for row r 
            for(int c = 0; c < scores[r].length; c++)
            {
                // stores the score for student r, assignment c 
                scores[r][c] = Math.random()*10; 
            }
        }
        //print out all scores 
        for(int r = 0; r < scores.length;r++)
        {
            //prints all the scores for all scores of student r 
            for(int c = 0; c < scores[r].length; c++)
            {
                //System.out.print(scores[r][c]+" ");
                System.out.printf("%.2f ",scores[r][c]); 
                //this is for formatting, %t is for int, %f is for float, %b is for boolean, %d is for double. 
                //to adjust decimal places, you do %.x(data type) (x is the number of places you want) 
            }
            System.out.println();
        }
    }

}
