package top.lxpsee.first.suspend;

/**
 * 努力常态化  2018/4/26 23:37
 */
public class MyThread extends Thread {

    private Long i = 0L;

    public Long getI() {
        return i;
    }

    public void setI(Long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
