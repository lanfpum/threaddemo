package top.lxpsee.second.synNotExtends;

/**
 * 努力常态化  2018/5/20 17:23
 */
public class ThreadA extends Thread {

    private Sub sub;

    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
