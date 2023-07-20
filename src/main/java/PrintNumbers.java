public class PrintNumbers {

    private final Object monitor = new Object();
    private int count = 1;

    public void print(int targetThreadId) {
        synchronized (monitor) {
            for (int i = 0; i < 25; i++) {
                while (count % 4 != targetThreadId) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程" + targetThreadId + ": " + count++);
                monitor.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();

        Thread thread0 = new Thread(() -> printNumbers.print(0));
        Thread thread1 = new Thread(() -> printNumbers.print(1));
        Thread thread2 = new Thread(() -> printNumbers.print(2));
        Thread thread3 = new Thread(() -> printNumbers.print(3));

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
