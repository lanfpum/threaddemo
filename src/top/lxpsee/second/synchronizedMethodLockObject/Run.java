package top.lxpsee.second.synchronizedMethodLockObject;

/**
 * 努力常态化  2018/5/6 16:00
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");

        a.start();
        b.start();
    }

}