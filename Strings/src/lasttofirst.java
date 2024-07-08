import java.util.Scanner;

public class lasttofirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();


        char ch1=str.charAt(str.length()-1);

        String str1="";

        str1+=ch1;

        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            str1+=ch;
        }

        System.out.println(str1);
    }
}
