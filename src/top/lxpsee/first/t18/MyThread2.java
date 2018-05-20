package top.lxpsee.first.t18;

/**
 * 努力常态化  2018/5/6 14:02
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThrad2 run priority = " + this.getPriority());
    }
}
