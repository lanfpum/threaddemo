package top.lxpsee.first.t15;

/**
 * 努力常态化  2018/4/26 22:43
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!!!");
    }

}
