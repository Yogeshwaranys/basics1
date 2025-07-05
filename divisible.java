import java.util.Scanner;
class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    for(int i=1;i<a;i++)
    {
        if((i%2==0)&&(i%3==0)&&(i%5==0))
        {
            System.out.print(i+" ");}
    }
}
}