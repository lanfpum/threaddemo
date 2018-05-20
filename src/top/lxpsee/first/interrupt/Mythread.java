package top.lxpsee.first.interrupt;

/**
 * 努力常态化  2018/4/25 23:27
 */
public class Mythread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态！我要退出了");
                    throw new InterruptedException();
                }

                System.out.println("i = " + (i + 1));
            }

            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进入catch");
            e.printStackTrace();
        }
    }
}
