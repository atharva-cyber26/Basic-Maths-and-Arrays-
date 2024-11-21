public class Stringcheck {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.hashCode());
        String str2=new String("Hello");
        System.out.println(str.hashCode());
        str="iop";
        System.out.println(str.hashCode());
    }
}
