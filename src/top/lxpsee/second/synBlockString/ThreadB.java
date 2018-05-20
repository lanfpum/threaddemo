package top.lxpsee.second.synBlockString;

/**
 * 努力常态化  2018/5/20 22:29
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUserNamePassword("B", "bb");
    }
}
