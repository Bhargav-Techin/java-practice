package oops.thread;



public class DivisibleSum {
    public static int currentNum = 0;
    public static boolean flag = true;
    private static final Object lock = new Object();

    static class Divisible implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 1; i <= 50; i++) {
                    if (i % 3 == 0) {
                        try {
                            currentNum = i;
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                flag = false;
                lock.notify();
            }
        }
    }

    static class SumNum implements Runnable {
        int sum = 0;

        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        sum += currentNum;
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Final sum: " + sum);
            }
        }
    }

    public static void main(String args[]) {
        Divisible divide = new Divisible();
        Thread t1 = new Thread(divide);
        t1.start();

        SumNum sumNum = new SumNum();
        Thread t2 = new Thread(sumNum);
        t2.start();
    }
}
