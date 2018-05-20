package top.lxpsee.second.doubleSycBlockOneTwo;

/**
 * 努力常态化  2018/5/20 21:30
 */
public class ThreadA extends Thread {
    private ObjectService service;

    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceA();
    }
}
