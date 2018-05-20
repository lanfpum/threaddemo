package top.lxpsee.first.t19;

import java.util.Random;

/**
 * 努力常态化  2018/5/6 14:21
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long addResult = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + j;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("---     Thread 2 use time = " + (end - begin));
    }
}
