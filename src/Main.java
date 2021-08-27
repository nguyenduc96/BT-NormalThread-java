import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();
        Thread.currentThread().setPriority(NORM_PRIORITY);
        Thread thread = new Thread(numberGenerator);
        Thread.currentThread().setPriority(NORM_PRIORITY);
        Thread thread1 = new Thread(numberGenerator);

        System.out.println("Luồng 1");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Luồng 2");
        thread1.start();
    }
}
