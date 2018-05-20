package top.lxpsee.second.synchronizedMethodLockObject2;

/**
 * 努力常态化  2018/5/6 15:59
 */
public class ThreadB extends Thread {
    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodB();
    }
}
