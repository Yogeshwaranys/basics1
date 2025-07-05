 import java.util.Scanner;

class  color{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        char color=a.next().charAt(0);
        switch(color){
        case 'G':
            System.out.println("Green");
            break;
        case 'O':
            System.out.println("Orange");
            break;
        
        case 'B':
            System.out.println("Blue");
            break;
        case 'Y':
            System.out.println("Yellow");
            break;
        case 'W':
            System.out.println("White");
            break;
        default:
            System.out.println("Invalid");
            break;  }
        }
} 
    

