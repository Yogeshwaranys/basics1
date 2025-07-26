// Checking Method Arguments

class Exception8 {
    public static void main(String[] args) {
 
        String s = "yogesh";
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }
        s = null;
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }
        s = "pradeep";
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }
    }
    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException(
                "The argument cannot be null");
      
        return s.length();
    }
}