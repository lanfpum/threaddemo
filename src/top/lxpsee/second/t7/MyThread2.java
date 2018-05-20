package top.lxpsee.second.t7;

/**
 * 努力常态化  2018/5/20 21:16
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
