package top.lxpsee.first.suspend2;

/**
 * 努力常态化  2018/5/2 23:19
 */
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");

        if (Thread.currentThread().getName().equals("A")) {
            System.out.println("Thread suspend forever");
            Thread.currentThread().suspend();
        }

        System.out.println("end");
    }
}
