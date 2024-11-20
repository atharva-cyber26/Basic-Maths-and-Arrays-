import java.util.Scanner;

public class Monthcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int i=0;

        while(t!=0)
        {
            System.out.println("Enter the month");
            int m=sc.nextInt();
            if(m==12 || m==1 || m==2)
                System.out.println("winter");
            else if(m==3 || m==4 || m==5 )
                System.out.println("Summer");
            else if(m==6 || m==7 || m==8 )
                System.out.println("Rainy");
            else
                System.out.println("Spring");
            t--;
        }




    }
}
