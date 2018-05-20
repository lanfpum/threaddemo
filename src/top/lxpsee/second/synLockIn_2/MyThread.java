package top.lxpsee.second.synLockIn_2;

/**
 * 努力常态化  2018/5/20 16:04
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
