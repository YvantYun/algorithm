package basicModel;

public class StringTo {
    public static void main(String[] args) {
//        String a = "123";
//        int i = Integer.parseInt(a,10);
//        System.out.println(i);
//
//        int j = Integer.valueOf(a).intValue();
//        System.out.println(j);
        int count = 0;
        for (int i = 0; i <10000;i++){
            if(isCircleNumber(i)){
                System.out.println("第" + count + "回文数：" + i);
            }
            count ++;
        }

    }

    public static boolean isCircleNumber(int i){
        String num_str = String.valueOf(i);
        StringBuilder stringBuilder = new StringBuilder(num_str).reverse();
        return num_str.equals(stringBuilder.toString());
    }
}
