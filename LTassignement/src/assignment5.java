import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.next();

        if (sc.hasNextInt()) {
            System.out.println("Invalid input format. Please provide name, designation, and salary.");
            return;
        }

        String designation=sc.next();

        if (!sc.hasNextInt()) {
            System.out.println("Invalid salary format. Please provide a numeric value.");
            return;
        }

        int n=sc.nextInt();
        double salary=(double) n;
        double bonus=0.0;
        if(designation.equals("M"))
        {
            bonus=0.10*salary;
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
            System.out.println("Salary: "+salary);
            System.out.println("Bonus: "+bonus);
        }
        else if(designation.equals("TL"))
        {
            bonus=0.15*salary;
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
            System.out.println("Salary: "+salary);
            System.out.println("Bonus: "+bonus);
        }
        else if(designation.equals("SSE"))
        {
            bonus=0.17*salary;
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
            System.out.println("Salary: "+salary);
            System.out.println("Bonus: "+bonus);
        }
        else if(designation.equals("SE"))
        {
            bonus=0.20*salary;
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
            System.out.println("Salary: "+salary);
            System.out.println("Bonus: "+bonus);
        }
        else
        {
            bonus=0.0;
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
            System.out.println("Salary: "+salary);
            System.out.println("Bonus: "+bonus);
        }

    }
}
