package top.lxpsee.first.t18;

/**
 * 努力常态化  2018/5/6 14:04
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority = " + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
