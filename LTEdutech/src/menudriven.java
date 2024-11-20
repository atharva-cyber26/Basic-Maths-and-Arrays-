import java.util.Scanner;

public class menudriven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.println("Enter the no of iteration");

        int t=sc.nextInt();
        int n;

        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            System.out.println(n%2==0?"even":"odd");
        }


    }
}
