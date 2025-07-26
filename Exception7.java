
class Exception7 {
    public static void main (String[] args) {

        String s = null;
        try
        {
            if ("gfg".equals("gfg"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");            
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}