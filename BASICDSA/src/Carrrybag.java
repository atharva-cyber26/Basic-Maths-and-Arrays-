import java.util.Scanner;

public class Carrrybag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int check1=0,check2=0, unchecked=0;

        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();


            if ((a + b) <=d)
            {
                check1=a;
                check2=b;
                unchecked=c;

                if(unchecked>=e)
                {
                    if((a+c)<=d)
                    {
                        check1=a;
                        check2=c;
                        unchecked=b;

                        if(unchecked>=e)
                        {
                                check1 = b;
                                check2 = c;
                                unchecked = a;
                            }
                        }
                    }
                }
            if(unchecked<=e)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

            }

        }




    }

