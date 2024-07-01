import java.util.Scanner;

public class countdigitsusingrecursion {

    public static int count(int n)
    {
        if(n-1==0 || n-1==-1)
        {
            return 1;
        }
        return count(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(count(n));
    }
}
