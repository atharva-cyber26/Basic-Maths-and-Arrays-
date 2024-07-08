import java.util.Scanner;

public class firsttolast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String str1="";
        char ch1=str.charAt(0);

        for(int i=1;i<str.length();i++ )
        {
            char ch=str.charAt(i);
            str1+=ch;
        }

        str1+=ch1;

        System.out.println(str1);


    }
}
