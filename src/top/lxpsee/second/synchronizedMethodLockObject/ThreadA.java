package top.lxpsee.second.synchronizedMethodLockObject;

/**
 * 努力常态化  2018/5/6 15:58
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodA();
    }
}
