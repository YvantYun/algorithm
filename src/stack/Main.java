package stack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        ResizingArrayStack<Integer> integers = new ResizingArrayStack<>();
//        for(int i = 0 ; i < 10 ; i++ ){
//            integers.push(i);
//        }
//       integers.pop();
//       while (integers.iterator().hasNext()){
//           int a = integers.iterator().next();
//           System.out.print(a);
//       }
        Calendar now = Calendar.getInstance();
        String time = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DAY_OF_MONTH) + " 00:00:00";
        System.out.println(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date a = formatter.parse("2019-1-9 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        now.add(Calendar.DATE, -2);
        int i = now.get(Calendar.DATE);
        System.out.println(i);
    }
}
