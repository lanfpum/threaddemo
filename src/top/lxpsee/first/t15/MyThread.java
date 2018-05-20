package top.lxpsee.first.t15;

/**
 * 努力常态化  2018/4/26 22:39
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i = " + (i + 1));
            }

            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep");
            e.printStackTrace();
        }
    }
}
