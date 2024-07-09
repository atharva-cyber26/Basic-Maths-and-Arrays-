import java.util.Scanner;

public class Firstconsenantsthenvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        StringBuilder sb1=new StringBuilder();


        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch!='a'&& ch!='e'&& ch!='i' && ch!='o'&& ch!='u'&& ch!='A' && ch!='E'&& ch!='I' && ch!='O' && ch!='U' )
            {
                sb.append(ch);
            }
            else {
                sb1.append(ch);
            }

        }

        String s = String.format("%s%s",sb,sb1);

        System.out.println(s);




    }
}
