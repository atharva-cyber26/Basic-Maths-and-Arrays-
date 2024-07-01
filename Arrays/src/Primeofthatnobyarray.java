import java.util.Arrays;

public class Primeofthatnobyarray {
    public static void main(String[] args) {
        int a=0,count=0,last=45;

        int arr[]=new int[last];


        while(true)
        {
            boolean flag=true;
            if(a==0 || a==1)
            {
                flag=false;
            }
            else
            {
                for(int i=2;i<a/2;i++)
                {
                    if(a%i==0) {
                        flag = false;
                        break;
                    }
                }
            }

             if(flag)
             {
                 arr[(arr.length-1)-(count++)]=a;
             }

             if(count==last)
             {
                 break;
             }


             a++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
