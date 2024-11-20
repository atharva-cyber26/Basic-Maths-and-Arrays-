public class Typecasting {
    public static void main(String[] args) {
        byte b=10;
        int a=b;
        System.out.println(a);

        System.out.println(b);

        byte b1= (byte) ((byte) a*2);

        byte b2=127;

        byte b3=(byte)128;

        System.out.println(b3);

        int i=127;

        String str="123";

        int o=1111111111;

        String string="100";

        int f=Integer.parseInt(string);

        System.out.println(f);





    }
}
