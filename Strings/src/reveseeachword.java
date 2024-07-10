import java.util.Scanner;

public class reveseeachword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int count=0;

        String arr[]=str.split(" ");


        StringBuilder reversestring=new StringBuilder();

        for(String str1:arr )
        {
            StringBuilder reversword=new StringBuilder(str1);
            reversword.reverse();
            count++;
            if(count>arr.length-1)
            {
                reversestring.append(reversword).append("");
            }
            else
            {
                reversestring.append(reversword).append(" ");
            }
        }

        System.out.println(reversestring);
    }
}
