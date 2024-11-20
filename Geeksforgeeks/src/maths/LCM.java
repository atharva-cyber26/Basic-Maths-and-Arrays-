package maths;

import java.util.Scanner;

public class LCM
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(findLcm(a,b));
    }


    /* Basic Approch to find Lcm
    public static int findLcm(int a,int b)
    {
        int res=Math.max(a,b);
        while (res!=0)
        {
            if(res%a==0 && res%b==0)
            {
                break;
            }
            res++;
        }
        return res;
    } */

    public static int findGCD(int a,int b)
    {
        if(b==0)
            return a;
        else
            return findGCD(b,b%a);
    }

    public static int findLcm(int a,int b)
    {
        return (a*b)/findGCD(a, b);
    }






}
