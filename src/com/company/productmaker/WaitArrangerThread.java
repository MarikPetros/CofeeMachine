package com.company.productmaker;

import com.company.display.Display;

public class WaitArrangerThread extends Thread {
   private Thread thread;
   public WaitArrangerThread(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        while (thread.isAlive()) {
            Display.print("* . . * . .\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
