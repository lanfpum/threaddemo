package top.lxpsee.second.t8;

/**
 * 努力常态化  2018/5/20 21:43
 */
public class Thread2 extends Thread {
    private Task task;

    public Thread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
