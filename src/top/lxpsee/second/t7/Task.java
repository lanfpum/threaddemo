package top.lxpsee.second.t7;

/**
 * 努力常态化  2018/5/20 21:10
 */
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("noSynchronized threadName = " + Thread.currentThread().getName() + " , i =" + i);
        }

        System.out.println("");

        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadname = " + Thread.currentThread().getName() + " , i =" + i);
            }
        }
    }
}
