public class StaticProgram {
    static int a = 10;


    public static void main(String[] args) {
        System.out.println(a);
        demo();
    }

    public static void demo() {
        System.out.println(a);
    }
    static{
        System.out.println("8");
    }
}
