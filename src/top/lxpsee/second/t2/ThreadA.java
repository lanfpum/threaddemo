package top.lxpsee.second.t2;

/**
 * 努力常态化  2018/5/6 15:31
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNmu hasSelfPrivateNmu;

    public ThreadA(HasSelfPrivateNmu hasSelfPrivateNmu) {
        super();
        this.hasSelfPrivateNmu = hasSelfPrivateNmu;
    }

    @Override
    public void run() {
        hasSelfPrivateNmu.addI("a");
    }
}
