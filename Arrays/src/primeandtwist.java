import java.util.Scanner;

public class primeandtwist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=isprime(n);

        if(flag)
        {
            int temp=n,rev=0;

            while(temp!=0)
            {
                int rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
            }

            if(isprime(rev))
            {
                System.out.println("The Given no is Prime and Twist no="+n);
            }
            else
            {
                System.out.println("The Given no not Prime and Twist no");
            }
        }


    }
    public static boolean isprime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
