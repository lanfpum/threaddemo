package top.lxpsee.second.synNotExtends;

/**
 * 努力常态化  2018/5/20 17:21
 */
public class Sub extends Service {
    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep bigin threadName = " + Thread.currentThread().getName()
                    + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName = " + Thread.currentThread().getName()
                    + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
