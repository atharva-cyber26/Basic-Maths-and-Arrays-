import java.util.Scanner;

public class Trainticketreservation {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String str;
        int ticketprice=500;
        int totalcount=0;
        int totalchild=0;
        int totaladult=0;
        int totalsenior=0;

        double totalticketamount=0;

       do {
           System.out.println("Enter the Name of Passenger");
           String name=sc.next();
           System.out.println("Enter the Age of Passenger");
           int age=sc.nextInt();


           if(age>0  && age<=5)
           {
               totalticketamount+= ticketprice*0.100;
               totalchild++;
               totalcount++;

           }

           else if(age>=6  && age<=11)
           {
               totalticketamount+= ticketprice*0.50;
               totaladult++;
               totalcount++;
           }

           else if(age>=12  && age<=64)
           {
               totalticketamount+= ticketprice;
               totaladult++;
               totalcount++;
           }
           else if(age>=65)
           {
               totalticketamount+= ticketprice*0.75;
               totalsenior++;
               totalcount++;
           }

           System.out.println("Do you want to book ticket");
           str=sc.next();
           str=str.toLowerCase();
       }while(str.equals("y") || str.equals("yes"));


       System.out.println("total no of ticket="+totalcount);

       System.out.println("total no of child ticket="+totalchild);

        System.out.println("total no of adult ticket="+totaladult);

        System.out.println("total no of seniorcitizen ticket="+totalsenior);

        System.out.println("Totalticketprice="+totalticketamount);


    }
}
