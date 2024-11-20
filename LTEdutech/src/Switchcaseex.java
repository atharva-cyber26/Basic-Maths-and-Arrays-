import java.util.Scanner;

public class Switchcaseex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //int day=sc.nextInt();


   String str=sc.nextLine();

    /*

       switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
        System.out.println("out of switch statement");
        */

        switch (str)
        {
            case "monday":
                System.out.println("Its monday");
                break;
            case "tuesday":
                System.out.println("Its Tuesday");
                break;
            case "wednesday":
                System.out.println("Its Wednesday");
                break;
            case "thrusday":
                System.out.println("Its thrusday");
                break;
            case "friday":
                System.out.println("Its Friday");
                break;
            case "saturday":
                System.out.println("Its saturday");
                break;
            default:
                System.out.println("Its a weekend");

        }



    }
}
