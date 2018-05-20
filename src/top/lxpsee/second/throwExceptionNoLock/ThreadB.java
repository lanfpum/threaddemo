package top.lxpsee.second.throwExceptionNoLock;

/**
 * 努力常态化  2018/5/20 16:30
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
