import java.util.Scanner;
 class oddeven {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            int num = a.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            a.close();
        }
    
}
