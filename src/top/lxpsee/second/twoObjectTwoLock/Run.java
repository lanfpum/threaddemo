package top.lxpsee.second.twoObjectTwoLock;

/**
 * 努力常态化  2018/5/6 15:50
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNmu nmu1 = new HasSelfPrivateNmu();
        HasSelfPrivateNmu nmu2 = new HasSelfPrivateNmu();

        ThreadA a = new ThreadA(nmu1);
        a.start();

        ThreadB b = new ThreadB(nmu2);
        b.start();
    }

}
