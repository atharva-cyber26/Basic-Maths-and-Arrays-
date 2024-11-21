import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {



                Scanner sc=new Scanner(System.in);


                int f=sc.nextInt();
                if(f<0)
                {

                    System.out.println("Invalid input value. The value cannot be negative.");
                    return;
                }
                String str=sc.next();
                String str1=sc.next();

                double f1=(double) f;
                if(str1.equals("ft"))
                {
                    System.out.println(f1*0.0833333+" ft");
                }
                else  if(str1.equals("in")  && str.equals("ft"))
                {
                    System.out.println(f1*12+" in");
                }
                else if((str.equals("in") || str.equals("ft")) && ( (!str1.equals("in") || !str1.equals("ft"))))
                {
                    System.out.println("Invalid output unit");
                }


                else
                {
                    System.out.println("Invalid input unit");
                }
            }
        }







