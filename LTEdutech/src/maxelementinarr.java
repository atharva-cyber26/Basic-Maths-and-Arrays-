import java.util.Scanner;

public class maxelementinarr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max=arr[0];


        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }

        System.out.println("Maximum element in array is="+max);

        System.out.println("Use of for each loop");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }


    }
}
