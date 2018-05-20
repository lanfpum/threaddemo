package top.lxpsee.second.t8;

/**
 * 努力常态化  2018/5/20 21:42
 */
public class Thread1 extends Thread {
    private Task task;

    public Thread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
