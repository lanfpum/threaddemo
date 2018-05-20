package top.lxpsee.first.stop;

/**
 * 努力常态化  2018/4/26 22:47
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                i++;
                System.out.println("i =" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
