package top.lxpsee.second.t6;

/**
 * 努力常态化  2018/5/20 17:38
 */
public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println(" task bigin");
            Thread.sleep(3000);
            String printGetData1 = "long time task ,get date from origin value 1 threadName =" + Thread.currentThread().getName();
            String printGetData2 = "long time task ,get date from origin value 2 threadName =" + Thread.currentThread().getName();

            synchronized (this) {
                getData1 = printGetData1;
                getData2 = printGetData2;
            }

            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
