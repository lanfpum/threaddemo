package top.lxpsee.second.throwExceptionNoLock;

/**
 * 努力常态化  2018/5/20 16:29
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
