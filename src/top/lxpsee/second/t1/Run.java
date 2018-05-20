package top.lxpsee.second.t1;

/**
 * 努力常态化  2018/5/6 15:35
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNmu h = new HasSelfPrivateNmu();
        ThreadA a = new ThreadA(h);
        a.start();

        ThreadB b = new ThreadB(h);
        b.start();
    }

}
