package top.lxpsee.first.stop2;

/**
 * 努力常态化  2018/4/26 23:05
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUserName() + "::: " + object.getPassword());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
