import java.util.Scanner;

public class assignement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();


        int b = sc.nextInt();

        int negationA = ~a;
        int leftShift = a << b;
        int rightShift = a >> b;
        int unsignedRightShift = a >>> b;
        int bitwiseAnd = a & b;
        int bitwiseXor = a ^ b;


        System.out.println(negationA);
        System.out.println(leftShift);
        System.out.println(rightShift);
        System.out.println(unsignedRightShift);
        System.out.println(bitwiseAnd);
        System.out.println(bitwiseXor);

    }
}
