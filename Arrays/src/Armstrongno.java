import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int length=0,temp=n,no=0;

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

        if(no==n)
            System.out.println("The given no is Armstrong no="+n);
        else
            System.out.println("The given no is not Armstrong no="+n);


    }
}
