package top.lxpsee.first;

/**
 * 努力常态化  2018/4/23 23:21
 */
public class Mythread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + " 计算，count = " + count);
    }
}
