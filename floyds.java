import java.util.Scanner;
class floyds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=1;
        for(int i=0;i<a;i++)
        {
         for(int j=0;j<=i;j++)
         {
             System.out.print(count+" "+"\t");
             count++;
         }
         System.out.println();
        }
}
}
