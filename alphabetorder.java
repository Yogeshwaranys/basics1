
import java.util.Scanner;

class   alphabetorder {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        char A1=a.next().charAt(0);
        char A2=a.next().charAt(0);
        if(A1<A2){
            System.out.println(A1+ " "+A2);
        }
        else{
            System.out.println(A2+ " "+A1);
        } 
        a.close();
   }
}

