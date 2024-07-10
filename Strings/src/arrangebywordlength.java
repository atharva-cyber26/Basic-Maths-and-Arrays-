import java.util.Scanner;

public class arrangebywordlength {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        String str1[]=str.split(" ");

        StringBuffer sb=new StringBuffer();

        int count=0;


        for(int i=0;i< str1.length-1;i++)
        {
                if(str1[i].length()> str1[i+1].length())
                {
                    String temp=str1[i];
                    str1[i]=str1[i+1];
                    str1[i+1]=temp;
                }
            }


        for(String word:str1)
        {
           count++;

           if(count>str1.length-1)
           {
               sb.append(word).append("");
           }
           else
           {
               sb.append(word).append(" ");
           }
        }

        System.out.println(sb);


    }
}
