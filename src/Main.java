public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = System.out::println;

        Worker worker2 = new Worker(listener,error);
        worker2.start();
    }
}
