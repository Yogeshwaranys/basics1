 import java .util.Scanner;

class alphabet {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
       char a=sc.next().charAt(0);
       if((a>=65)&&(a<=90))
       {
           a+=32;
         System.out.println(a+" ");
       }
    else
    {
     a-=32;
     System.out.println(a+" ");}
}
} 
    

