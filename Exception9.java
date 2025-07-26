public class Exception9 {
    public static void main(String[] args) {
        try {

            NumberFormatException ex = new NumberFormatException("Primary Exception");
            ex.initCause(new NullPointerException("Root cause of the exception"));
            throw ex;
        } 
        catch (NumberFormatException ex) {

            System.out.println("Caught Exception");
            System.out.println("Cause of Exception" );
        }
    }
}
