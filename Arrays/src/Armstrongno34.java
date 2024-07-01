import java.util.Scanner;

public class Armstrongno34 {
    public static void main(String[] args) {
        int a=0,count=0;

        while(true)
        {
            boolean flag=isarmstrong(a);
            if(flag)
            {
                count++;
            }
            if(count==34)
            {
                System.out.println("34th Armstrong no is="+a);
                break;
            }
            a++;

        }
    }
    public static boolean isarmstrong(int n)
    {
        int temp=n,length=0,no=0;

        while(temp!=0)
        {
            length++;
            temp/=10;
        }
        temp=n;
        while(temp!=0)
        {
            int rem=temp%10;
            no+=Math.pow(rem,length);
            temp/=10;
        }

        return no==n;
    }
}
