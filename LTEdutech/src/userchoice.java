import java.util.Scanner;

public class userchoice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="YES";

        while(str.toLowerCase().equals("Yes") || str.equals("Y"))
        {
            int n=sc.nextInt();

            System.out.println(n%2==0 ? "Even" :"Odd");

            System.out.println("Do you want to continue");
            str=sc.next();


        }
    }
}
