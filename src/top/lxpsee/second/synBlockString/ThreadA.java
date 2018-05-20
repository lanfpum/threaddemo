package top.lxpsee.second.synBlockString;

/**
 * 努力常态化  2018/5/20 22:28
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUserNamePassword("A", "aa");
    }
}
