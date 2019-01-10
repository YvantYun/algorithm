package stack;

public class Main {
    public static void main(String[] args) {
        //双栈法
        //数值栈，压入数值
        LinkedListStack<String> dataStack = new LinkedListStack<>();
        //操作符栈，压入 +-*/
        LinkedListStack<String> oprStack  = new LinkedListStack<>();
        String str ="1+2)*3-4)*5-6)))";
        String[] param = str.split("");
        for(int i = 0 ; i < str.length();i ++){
            if(param[i].equals("+") || param[i].equals("-") || param[i].equals("*") || param[i].equals("/")){
                oprStack.push(param[i]);
            }else if(param[i].equals(")")){
                StringBuilder res = new StringBuilder();
                //因为是压栈，压进去的是相反的
                res.append(")").append(dataStack.pop()).append(oprStack.pop()).append(dataStack.pop()).append("(");
                dataStack.push(res.toString());
            }else {
                dataStack.push(param[i]);
            }
        }
        String res = dataStack.pop();
        System.out.println(res);
        StringBuilder temp = new StringBuilder();
        for(int i = res.length() -1; i >=0; i --){
            temp.append(res.charAt(i));
        }
        System.out.println(temp.toString());


    }
}
