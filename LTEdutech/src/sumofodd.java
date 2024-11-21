import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oddsum=0;

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
                oddsum+=arr[i];

        }

        System.out.println("oddsum"+oddsum);
    }
}
