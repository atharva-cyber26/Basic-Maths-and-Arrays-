import java.util.Scanner;

public class removefirstchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        int count=0;

        String str1[]=str.split(" ");

        StringBuilder sb=new StringBuilder();


        for(String wi:str1)
        {
            if(wi.length()>1)
            {
                count++;
                if(count>str1.length-1)
                {
                    sb.append(wi.substring(1)).append("");
                }
                else
                sb.append(wi.substring(1)).append(" ");
            }
            else
            {
                sb.append(" ");
            }
        }

        System.out.println(sb);


    }
}
