package top.lxpsee.first.t19;

import java.util.Random;

/**
 * 努力常态化  2018/5/6 14:15
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long addResult = 0;
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                int i1 = new Random().nextInt();
                addResult = addResult + j;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("***     thread 1 use time = " + (end - begin));
    }
}
