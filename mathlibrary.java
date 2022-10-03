public class mathlibrary 
{
    public static void main(String[]args)
    {
       int intVal = Integer.parseInt(args[0]);
       double douVal = Double.parseDouble(args[1]);
       boolean boolVal = Boolean.parseBoolean(args[2]);
       // both values in pow has to match, can't use double & int 
       int powIntVal = (int) Math.pow(intVal,3);
       double floor = Math.floor(douVal); 
       double ceil = Math.ceil(douVal);
       System.out.println(intVal+", "+powIntVal);
       System.out.println(douVal+", "+floor+", "+ceil);
    }
    
}
