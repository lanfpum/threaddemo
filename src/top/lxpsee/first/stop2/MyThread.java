package top.lxpsee.first.stop2;

/**
 * 努力常态化  2018/4/26 23:02
 */
public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
