package Part14.Synchronized;

public class SynchronizedExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Thread1 thread1 = new Thread1();
        thread1.setCalculator(calculator);
        thread1.start();
        thread1.interrupt();

        Thread2 thread2 = new Thread2();
        thread2.setCalculator(calculator);
        thread2.start();
        thread2.interrupt();
    }
}
