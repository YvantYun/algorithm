
import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            str = sc.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
            str = str.replace("？","!");
            System.out.println(str);
        }


    }
}
