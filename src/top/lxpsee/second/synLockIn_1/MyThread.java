package top.lxpsee.second.synLockIn_1;

/**
 * 努力常态化  2018/5/20 15:45
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
