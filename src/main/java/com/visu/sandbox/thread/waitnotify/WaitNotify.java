package com.visu.sandbox.thread.waitnotify;

public class WaitNotify {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();

        synchronized(b){
            System.out.println("A caught the monitor");
            try{
                System.out.println("A Waiting for b to complete...");
                b.wait();
                System.out.println("A After wait");
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("A Finish");
        }
        System.out.println("A released the monitor");
    }
}

class ThreadB extends Thread{
    @Override
    public void run(){
        System.out.println("B is running");
        synchronized(this){
            System.out.println("B caught the monitor");
            for (int i = 1; i <= 10; i++){
                System.out.println("B step " + i);
            }
            notify();
            System.out.println("B After notify");
        }
        System.out.println("B released the monitor");
    }
}
