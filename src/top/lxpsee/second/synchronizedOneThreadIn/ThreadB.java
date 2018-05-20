package top.lxpsee.second.synchronizedOneThreadIn;

/**
 * 努力常态化  2018/5/20 18:05
 */
public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
