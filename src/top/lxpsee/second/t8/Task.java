package top.lxpsee.second.t8;

/**
 * 努力常态化  2018/5/20 21:39
 */
public class Task {
    public void otherMethod() {
        System.out.println("---------------------------------------------- run ------ otherMethod----------------------------------------------");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchrodized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }

}
