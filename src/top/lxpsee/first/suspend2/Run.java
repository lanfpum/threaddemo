package top.lxpsee.first.suspend2;

/**
 * 努力常态化  2018/5/2 23:23
 */
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread.setName("A");
            thread.start();
            Thread.sleep(1000);
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread1 start,but cannot into printString()");
                    System.out.println("printString() was into by A ");
                    object.printString();
                }
            };
            thread1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
