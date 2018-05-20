package top.lxpsee.first.interrupt;

/**
 * 努力常态化  2018/4/25 23:28
 */
public class Run {
    public static void main(String[] args) {
        try {
            Mythread mythread = new Mythread();
            mythread.start();
            Thread.sleep(2000);
            mythread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end ");
    }

}
