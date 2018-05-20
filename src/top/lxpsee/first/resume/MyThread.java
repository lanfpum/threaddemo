package top.lxpsee.first.resume;

/**
 * 努力常态化  2018/5/2 23:34
 */
public class MyThread extends Thread {
    private Long i = 0L;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("i = " + i);
        }
    }
}
