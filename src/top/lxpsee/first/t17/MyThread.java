package top.lxpsee.first.t17;

/**
 * 努力常态化  2018/5/6 13:44
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long count = 0;
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }

        long end = System.currentTimeMillis();
        System.out.println("need Time :" + (end - begin) + "haomiao!");

    }
}
