public class palindromeno83 {
    public static void main(String[] args) {
        int n=1,count=0;

        while(true)
        {
            boolean flag=ispalindrome(n);

            if(flag)
                count++;

            if(count==83)
            {
                System.out.print("83rd palindrome no="+n);
                break;
            }
            n++;

        }

    }
    public static boolean ispalindrome(int n)
    {
        int temp=n,sum=0;
        while (temp!=0)
        {
            int rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }

       return sum==n;
    }
}
