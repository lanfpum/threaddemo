package top.lxpsee.first.re;

/**
 * 努力常态化  2018/4/26 23:11
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("tingzhile ++++");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }

    }
}
