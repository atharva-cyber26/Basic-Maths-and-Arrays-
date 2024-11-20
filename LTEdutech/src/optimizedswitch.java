
import java.util.Scanner;

public class optimizedswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str;


        do {
           int day=sc.nextInt();
            switch(day)
            {
                case 0:
                case 6:
                    System.out.println("Hurray ! its weekend");
                    break;
                case 01:
                case 02:
                case 03:
                case 04:
                case 05:
                    System.out.println("Its working day");
                    break;

                default:
                    System.out.println("Invalid input");

            }
            System.out.println("Do you want to continue");
            str=sc.next();
            str=str.toLowerCase();

        } while (str.equals("y") || str.equals("yes"));
    }
}
