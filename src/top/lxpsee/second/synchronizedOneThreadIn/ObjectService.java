package top.lxpsee.second.synchronizedOneThreadIn;

/**
 * 努力常态化  2018/5/20 18:02
 */
public class ObjectService {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin Time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end Time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
