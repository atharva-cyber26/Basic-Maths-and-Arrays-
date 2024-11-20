import java.util.Scanner;

public class evenoroddusingwhile {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int t;

        while(n!=0)
        {
            t=sc.nextInt();
            System.out.println(n%2==0?"Even" :"Odd");
            n--;
        }

    }
}
