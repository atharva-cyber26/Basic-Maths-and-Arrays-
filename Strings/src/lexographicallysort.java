import java.util.Arrays;
import java.util.Scanner;

public class lexographicallysort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String str1[]=str.split(" ");

        int count=0;

        Arrays.sort(str1);

        StringBuilder sb=new StringBuilder();

        for(String str3:str1)
        {
            count++;
            if(count>str1.length)
            {
                sb.append(str3).append("");
            }
            else
            {
                sb.append(str3).append(" ");
            }


        }

        System.out.println(sb);

    }
}
