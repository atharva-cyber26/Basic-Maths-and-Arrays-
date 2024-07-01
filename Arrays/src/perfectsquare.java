public class perfectsquare {
    public static void main(String[] args) {

        int a=1,count=0;
        while (true)
        {
            double d=Math.sqrt(a);

            if(d-Math.floor(d)==0)
                count++;

            if(count==58)
            {
                System.out.println("58th perfect Square no is="+a);
                break;
            }
            a++;

        }
    }
}
