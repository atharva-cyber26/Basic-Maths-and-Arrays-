import java.util.Scanner;

public class appendcharlength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String str1[]=str.split(" ");

        int count=0;

        StringBuilder sb=new StringBuilder();

        for(String oop:str1)
        {
            if(count>str1.length-1)
            {
                sb.append(oop).append(oop.length()).append("");
                count++;
            }
            else
            {
                sb.append(oop).append(oop.length()).append(" ");
                count++;
            }
        }

        System.out.println(sb);
    }
}
