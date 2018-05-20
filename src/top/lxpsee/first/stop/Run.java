package top.lxpsee.first.stop;

/**
 * 努力常态化  2018/4/26 22:49
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
