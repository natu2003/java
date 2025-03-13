public class swp1{
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap: a = " + a + ", b = " + b);
    }
}
