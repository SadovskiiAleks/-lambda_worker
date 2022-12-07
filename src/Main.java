public class Main {
    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener error = System.out::println;

        Worker worker2 = new Worker(listener,error);
        worker2.start();
    }
}
