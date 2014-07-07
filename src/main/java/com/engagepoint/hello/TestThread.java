package com.engagepoint.hello;

/**
 * Created by lyolik on 07.07.2014.
 */
public class TestThread implements Runnable{
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Hello from a thread!");
        }
    }

    public static void main(String args[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Main start!");
                for (int i=0; i<10; i++) {
                    System.out.println("Hello from a thread 1!");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    System.out.println("Hello from a thread 2!");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    System.out.println("Hello from a thread 3!");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();

        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    System.out.println("Hello from a thread 4!");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t4.start();
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main finish!");
/*        (new Thread(new TestThread())).start();
        (new Thread(new TestThread())).start();*/
    }

}
