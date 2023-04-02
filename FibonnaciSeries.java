import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args)  {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        if(n==1)
        {
            System.out.print(a);   
        }
        else if(n==2)
        {
            System.out.print(a+" "+b);
        }
        else
        {
            System.out.print(a+" "+b+" ");
            for(int i=2;i<=n;i++)
            {
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
