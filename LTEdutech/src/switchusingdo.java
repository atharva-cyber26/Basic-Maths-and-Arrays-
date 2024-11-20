import java.util.Scanner;

public class switchusingdo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="y";
        int day;


        while(str.equals("y"))
        {

            day = sc.nextInt();

            switch (day) {
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
            System.out.println("Do you want to continue");
            str = sc.next();

        }



    }
}
