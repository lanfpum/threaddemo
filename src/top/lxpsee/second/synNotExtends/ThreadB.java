package top.lxpsee.second.synNotExtends;

/**
 * 努力常态化  2018/5/20 17:25
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
