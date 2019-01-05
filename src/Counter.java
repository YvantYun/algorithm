public class Counter {
    private final String name;
    private int count;

    public Counter(String name){
        this.name = name;
    }

    public void increment(){
        count ++;
    }

    public int tally(){
        return count;
    }

    @Override
    public String toString(){
//        StringBuilder res = new StringBuilder();
//        res.append(name).append("计数次数").append(count);
        String res = name + "----" + count;
        return res;

    }
}
