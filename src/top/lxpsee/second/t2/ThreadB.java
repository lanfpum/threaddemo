package top.lxpsee.second.t2;

/**
 * 努力常态化  2018/5/6 15:33
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNmu hasSelfPrivateNmu;

    public ThreadB(HasSelfPrivateNmu hasSelfPrivateNmu) {
        super();
        this.hasSelfPrivateNmu = hasSelfPrivateNmu;
    }

    @Override
    public void run() {
        hasSelfPrivateNmu.addI("b");
    }
}
