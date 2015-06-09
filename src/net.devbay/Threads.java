package net.devbay;

public class Threads {
    public static void main(String[] args) {

        System.out.println("Start of the main method execution");

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Start of the run method execution");
                int i=0;
                try {
                    while (i<10) {
                        try {
                            i++;
                            Thread.sleep(1000);
                        } catch (InterruptedException x) {
                        }
                        System.out.println("Thread execution: " + Thread.currentThread());
                    }
                } finally {
                    System.out.println("Stop of the run method execution");
                }
            }
        };

        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }

        System.out.println("End of the main method execution");
    }
}
