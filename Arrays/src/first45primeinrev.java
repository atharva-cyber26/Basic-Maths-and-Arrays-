public class first45primeinrev {
    public static void main(String[] args) {
        int n=3,count=0,rev=0;
        while(count<45)
        {
            boolean flag=isprime(n);
            if(flag)
            {
                count++;
                rev=n;
            }
               n++;
        }

        for(int i=rev;i>=1;i--)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }


    }

    public static boolean isprime(int n)
    {
        if(n==1||n==2)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
