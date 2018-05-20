package top.lxpsee.second.doubleSycBlockOneTwo;

/**
 * 努力常态化  2018/5/20 21:31
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
        service.serviceB();
    }
}
