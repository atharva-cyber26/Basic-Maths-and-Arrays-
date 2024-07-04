import java.util.Scanner;

public class requriedforpair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        int sum=0,count=0,sum1=0;

        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            count++;
        }

        int avg=sum/count;
        if(sum%2==0)
        {
             for(int i=0;i<arr.length;i++)
             {
                 if(arr[i]<avg)
                 {
                     sum1+=avg-arr[i];
                 }
             }

             System.out.println(sum1);
        }
        else
        {
            System.out.println("-1");
        }

    }
}
