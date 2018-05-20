package top.lxpsee.second.synBlockString;

/**
 * 努力常态化  2018/5/20 22:30
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("AA");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("BB");
        threadB.start();
    }
}
