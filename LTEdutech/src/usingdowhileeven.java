import java.util.Scanner;

public class usingdowhileeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        do {
            int n=sc.nextInt();
            System.out.println(n%2==0?"Even":"odd");
            t--;

        } while(t!=0);
    }
}
