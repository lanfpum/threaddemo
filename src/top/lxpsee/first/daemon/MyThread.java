package top.lxpsee.first.daemon;

/**
 * 努力常态化  2018/5/6 14:48
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        while (true) {
            try {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
