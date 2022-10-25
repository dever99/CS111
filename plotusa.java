public class plotusa 
{
    public static void main(String[]args)
    {
        double ymin = StdIn.readDouble(); 
        double xmin = StdIn.readDouble(); 
        double ymax = StdIn.readDouble(); 
        double xmax = StdIn.readDouble(); 

        StdDraw.setXscale(xmin,xmax);
        StdDraw.setYscale(ymin,ymax);
        StdDraw.setPenColor(100,0,0);//R G B

        while(!StdIn.isEmpty())
        {
            double y = StdIn.readDouble(); 
            double x = StdIn.readDouble(); 
            StdDraw.point(xmax-xmin,y); // draws a point
        }
    }
    
}
