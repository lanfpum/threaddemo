package top.lxpsee.first.t19;

/**
 * 努力常态化  2018/5/6 14:25
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(6);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(5);
            thread2.start();
        }
    }

}