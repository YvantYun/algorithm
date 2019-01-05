package basicModel;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入同学信息的个数");
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入同学的信息");
        String[] str = new String[i];
        for(int j = 0 ; j < str.length; j++){
            str[j] = scanner.nextLine();
        }

        System.out.println("-------------表格-------------");

        for (int j = 0; j < i; j++) {
            String[] s = str[j].split("\\s+");
            System.out.printf("姓名：%-10s   成绩1：%-10s   成绩二：%-10s   相除：%-13.3f \n", s[0], s[1], s[2],
                    Double.parseDouble(s[1]) / Double.parseDouble(s[2]));
        }

    }
}
