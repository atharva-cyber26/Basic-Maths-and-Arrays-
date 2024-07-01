public class perfectcubenoinrev {
    public static void main(String[] args) {
        int a=1,count=0,rev=0;

        while (true)
        {
            double d=Math.cbrt(a);

            if(d-(Math.floor(d))==0)
            {
                count++;
            }

            if(count==51)
            {
                rev=a;
                break;
            }
            a++;
        }

        for(int i=rev;i>=1;i--)
        {
            double d=Math.cbrt(i);

            if(d-(Math.floor(d))==0)
            {
                System.out.print(i+" ");
            }
        }


    }
}
