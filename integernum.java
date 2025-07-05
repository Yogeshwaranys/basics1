import java.util.Scanner;
 class integernum {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        a.close();
        
    }
    
}
