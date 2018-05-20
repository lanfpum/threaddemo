package top.lxpsee.first.resume;

/**
 * 努力常态化  2018/5/2 23:35
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
