package top.lxpsee.second.doubleSycBlockOneTwo;

/**
 * 努力常态化  2018/5/20 21:26
 */
public class ObjectService {
    public void serviceA() {
        try {
            synchronized (this) {
                System.out.println("A begin time :" + System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("A end time :" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceB() {
        synchronized (this) {
            System.out.println("B begin time :" + System.currentTimeMillis());
            System.out.println("B end time :" + System.currentTimeMillis());
        }
    }

}
