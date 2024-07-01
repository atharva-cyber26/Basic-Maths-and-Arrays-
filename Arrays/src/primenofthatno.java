import java.util.Scanner;

public class primenofthatno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;

        int n=3;

        while(true)
        {
            boolean flag=isprime(n);

            if(flag)
            {
                count++;
            }
            if(count==37)
            {
                System.out.print("The 37th Prime no is="+n);
                break;
            }
            n++;
        }


    }
    public static boolean isprime(int n)
    {
        if(n==1||n==2)
            return true;

       for(int i=2;i<n/2;i++)
       {
           if(n%i==0)
               return false;
       }
       return true;
    }
}
