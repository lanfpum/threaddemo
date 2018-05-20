package top.lxpsee.second.synNotExtends;

/**
 * 努力常态化  2018/5/20 17:18
 */
public class Service {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main 下一步 sleep bigin threadName = " + Thread.currentThread().getName()
                    + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName = " + Thread.currentThread().getName()
                    + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
