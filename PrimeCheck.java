import java.util.Scanner;
class PrimeCheck
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        // int flag=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
                System.out.println(i);
            }
        }
        if(count>1)
        {
            System.out.println("noprime");
        }
        else
        {
            System.out.println("prime");
        }
    }
}