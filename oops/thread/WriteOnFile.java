package oops.thread;


public class WriteOnFile implements Runnable {

    static boolean takenInput = false;

    public void run() {
        System.out.println("RUNNING");
        try {

            int i = 0;

            while (!takenInput) {
                Main.writeOn("I'm writing iteration " + (i++) + "\n" );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
