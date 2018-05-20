package top.lxpsee.second.synchronizedOneThreadIn;

/**
 * 努力常态化  2018/5/20 18:06
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
