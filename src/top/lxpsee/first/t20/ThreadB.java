package top.lxpsee.first.t20;

/**
 * 努力常态化  2018/5/6 14:35
 */
public class ThreadB extends Thread {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
