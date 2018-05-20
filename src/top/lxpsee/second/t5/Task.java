package top.lxpsee.second.t5;

/**
 * 努力常态化  2018/5/20 17:38
 */
public class Task {
    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        try {
            System.out.println(" task bigin");
            Thread.sleep(3000);
            getData1 = "long time task ,get date from origin value 1 threadName =" + Thread.currentThread().getName();
            getData2 = "long time task ,get date from origin value 2 threadName =" + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
