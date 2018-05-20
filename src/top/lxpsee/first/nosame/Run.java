package top.lxpsee.first.nosame;

/**
 * 努力常态化  2018/5/6 13:19
 */
public class Run {

    public static void main(String[] args) {
        try {
            final MyObject object = new MyObject();
            Thread thread = new Thread() {
                @Override
                public void run() {
                    object.setValue("a", "aa");
                }
            };
            thread.setName("a");
            thread.start();
            Thread.sleep(5000);

            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printUserNameAndPPassword();
                }
            };
            thread1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
