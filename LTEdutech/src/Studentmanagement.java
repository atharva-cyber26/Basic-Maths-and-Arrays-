import java.util.Scanner;

public class Studentmanagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int total=0;
        int avg=0;
        String result="";
        String grade = "";

        int totalstudent=0;
        int totalpass=0;
        int totalfail=0;

        do{
            System.out.println("Enter the student name");
            String name=sc.next();
            System.out.println("Enter the first subject mark");
            int m1=sc.nextInt();
            System.out.println("Enter the second subject mark");
            int m2=sc.nextInt();
            System.out.println("Enter the third subject mark");
            int m3=sc.nextInt();

            total=m1+m2+m3;
            avg=total/3;

            if(avg>=91 && avg<=100 )
            {
               grade="A+";
                result="pass";
                totalstudent++;
                totalpass++;


            }
            else if(avg>=81 && avg<=90 )
            {
               grade="A";
                result="pass";
                totalstudent++;
                totalpass++;
            }
            else if(avg>=71 && avg <=80 )
            {
                grade="B+";
                result="pass";
                totalstudent++;
                totalpass++;
            }
            else if(avg>=61 && avg<=70 )
            {
                grade="B";
                result="pass";
                totalstudent++;
                totalpass++;
            }
            else if(avg>=50 && total<=60)
            {
                grade="C";
                result="pass";
                totalstudent++;
                totalpass++;
            }

            else if(avg<50)
            {
                grade="E";
                result="fail";
                totalfail++;
                totalstudent++;
            }


            System.out.println("//////SCORECARD///////");

            System.out.println("Total marks of All subjects="+total);

            System.out.println("Avg marks of All subjects="+avg);

            System.out.println("Your grade in examination="+grade);

            System.out.println("The status of examination="+result);



            System.out.println("Do you want add the data of another student");
            str=sc.next();
            str=str.toLowerCase();
        }while(str.equals("y") || str.equals("yes"));

        System.out.println("Total no of students="+totalstudent);

        System.out.println("Total pass students="+totalpass);

        System.out.println("Total fail studnets="+totalfail);
    }
}
