public class Main {
    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        heads.increment();
        tails.increment();

        System.out.println(heads);
    }
}
