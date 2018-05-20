package top.lxpsee.second.t6;

/**
 * 努力常态化  2018/5/20 17:50
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Long beginTime = CommonUtils.beginTime1;

        if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }

        Long endTime = CommonUtils.endTime1;

        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }

        System.out.println("need Time :" + ((endTime - beginTime) / 1000));
    }

}
