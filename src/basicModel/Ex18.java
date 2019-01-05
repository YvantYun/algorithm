package basicModel;

public class Ex18 {
    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        System.out.println(mystery2(3,11));
    }
}
