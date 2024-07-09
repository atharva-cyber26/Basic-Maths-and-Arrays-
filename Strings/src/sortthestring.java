import java.util.Arrays;
import java.util.Scanner;

public class sortthestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

           if(isvowel(ch))
           {
               sb.append(ch);
           }
           else
           {
               sb1.append(ch);
           }
        }

        char ch[]=sb.toString().toCharArray();
        char ch1[]=sb1.toString().toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);


        StringBuilder sb2=new StringBuilder();

        sb2.append(ch);
        sb2.append(ch1);

        System.out.println(sb2);

    }

    public static boolean isvowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        return  ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u';
    }
}
