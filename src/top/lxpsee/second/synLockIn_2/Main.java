package top.lxpsee.second.synLockIn_2;

/**
 * 努力常态化  2018/5/20 15:53
 */
public class Main {
    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
