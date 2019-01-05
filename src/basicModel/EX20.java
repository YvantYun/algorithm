package basicModel;

public class EX20 {
    public static double ln(int N){
        if(N ==0 || N==1){
            return 0;
        }
        return Math.log(N) + ln(N - 1);
    }

    public static void main(String[] args) {
        System.out.println(ln(3));
    }
}
