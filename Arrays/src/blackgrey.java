import java.util.Arrays;

public class blackgrey {
    public static void main(String[] args) {
        int arr[]={14,12,17,24,22,20,15,18,27,19,11,8};


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%4==0 && arr[i]%6==0)
            {
                arr[i]=-3;
            }
            else if(arr[i]%4==0)
            {
                arr[i]=-1;
            }
            else if(arr[i]%6==0)
            {
                arr[i]=-2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
