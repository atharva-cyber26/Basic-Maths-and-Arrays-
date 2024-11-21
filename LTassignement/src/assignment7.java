import java.util.Scanner;



public class assignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt())
        {
            System.out.println("Error: Invalid input. Please enter a numeric value for speed.");
            return;
        }
        int speed=sc.nextInt();

        double speed1 = (double) speed;



        if(speed1>0)
        {
            System.out.println(speed1*5+" km");
        }
        else if(speed1<0)
        {
            System.out.println("Error: Invalid input. Please enter a positive numeric value for speed.");
        }
        else
        {
            System.out.println("Error: Invalid input. Please enter a numeric value for speed.");
        }
    }
}
