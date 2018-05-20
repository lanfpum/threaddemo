package top.lxpsee.second.t7;

/**
 * 努力常态化  2018/5/20 21:18
 */
public class Test {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.setName("1");
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.setName("222");
        thread2.start();
    }
}
