import java.util.Scanner;

public class firstandlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        String str1="";

        char ch1=str.charAt(0);

        char ch2=str.charAt(str.length()-1);



        str1+=ch2;

        for(int i=1;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);

            str1+=ch;
        }

        str1+=ch1;

        System.out.println(str1);




    }
}
