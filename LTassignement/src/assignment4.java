import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String str=sc.nextLine();
        int length=str.length();
        double charge=0.0;
        if(length<=15 && length>10)
        {
            charge+=5.0;
            System.out.println("Total length of Message : "+length);
            System.out.println("Total Charge : Rs."+charge);

        }
        else if (length>15)
        {
            charge+=5+(length-15);
            System.out.println("Total length of Message : "+length);
            System.out.println("Total Charge : Rs."+charge);
        }
        else  if(length<10)
        {

            System.out.println("Total length of Message : "+length);
            System.out.println("Free of cost ");

        }
    }
}
