import java.util.Scanner;

public class Palindromicprimeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;

        if(n==1 ||n==2)
            flag=false;

        for(int i=3;i<n/2;i++)
        {
            if(n%i==0)
                flag=false;
        }

        if(flag)
        {
            boolean f=palindrome(n);

            if(f)
            {
                System.out.println("The no is palindromic prime no="+n);
            }
            else
            {
                System.out.println("Not Palindromic prime no="+n);
            }

        }
        else
        {
            System.out.println("The no is not prime no");
        }

    }
    public static boolean palindrome(int n)
    {
        int temp=n,no=0;
         while(temp!=0)
         {
             int rem=temp%10;
             no=no*10+rem;
             temp/=10;
         }
         return  no==n;
    }
}
