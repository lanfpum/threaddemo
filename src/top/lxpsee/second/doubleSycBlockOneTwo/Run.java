package top.lxpsee.second.doubleSycBlockOneTwo;

/**
 * 努力常态化  2018/5/20 21:32
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
