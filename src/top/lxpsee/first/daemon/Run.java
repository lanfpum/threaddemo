package top.lxpsee.first.daemon;

/**
 * 努力常态化  2018/5/6 14:51
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("leave thread   stop!!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
