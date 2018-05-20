package top.lxpsee.second.synchronizedMethodLockObject2;

/**
 * 努力常态化  2018/5/6 15:55
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin MeThodA ThreadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end ThreadName = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB() {
        try {
            System.out.println("begin MeThodA ThreadName = " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("end ThreadName = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
