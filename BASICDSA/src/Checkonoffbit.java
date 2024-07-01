public class Checkonoffbit {
    public static void main(String[] args) {
        int n=4;
        int i=1;

        int mask=1<<i;

        if((n&mask)==0) //
        {
            System.out.println("OFF");
        }
        else
        {
            System.out.println("ON");
        }
    }
}
